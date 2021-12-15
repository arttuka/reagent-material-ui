(ns reagent-mui.util)

(defmacro e
  "Wrapper for React.createElement"
  [component props & children]
  (list* 'react/createElement component props children))

(defmacro forward-ref
  "Wrapper for React.forwardRef"
  {:arglists '([name? [props ref] & body])}
  [name-or-bindings bindings? & body]
  (let [[name bindings body] (if (symbol? name-or-bindings)
                               [[name-or-bindings] bindings? body]
                               [nil name-or-bindings (cons bindings? body)])]
    (assert (vector? bindings) "forward-ref requires a vector for its bindings")
    (assert (= 2 (count bindings)) "forward-ref requires bindings of [props ref]")
    `(react/forwardRef (fn ~@name ~bindings
                         ~@body))))

(defmacro react-component
  "Helper for creating anonymous React components with Reagent"
  {:arglists '([[props] & body])}
  [bindings & body]
  (assert (vector? bindings) "react-component requires a vector for its bindings")
  (let [argsyms (repeatedly (count bindings) #(gensym "arg"))]
    `(fn [~@argsyms]
       (let [~@(interleave bindings (for [sym argsyms]
                                      (list 'reagent-mui.util/js->clj' sym)))]
         (reagent.core/as-element (do ~@body))))))

(defmacro create-svg-icon [path display-name]
  `(let [component# (react/memo (forward-ref ~(symbol display-name) [props# ref#]
                                  (e (.-default ~'SvgIcon)
                                     (js/Object.assign (cljs.core/js-obj "ref" ref#) props#)
                                     ~@(if (vector? path) path [path]))))]
     (reagent-mui.util/adapt-react-class component# ~display-name)))
