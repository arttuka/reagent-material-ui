(ns reagent-material-ui.util)

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
  (assert (= 1 (count bindings)) "react-component requires bindings of [props]")
  `(fn [props#]
     (let [~@bindings (reagent-material-ui.util/js->clj' props#)]
       (reagent.core/as-element (do ~@body)))))
