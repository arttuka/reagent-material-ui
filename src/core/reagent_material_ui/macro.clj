(ns reagent-material-ui.macro)

(defmacro e
  "Wrapper for React.createElement"
  [component props & children]
  `(~'.createElement ~'js/React ~component ~props ~@children))

(defmacro forward-ref
  "Wrapper for React.forwardRef"
  [name-or-bindings bindings? & body]
  (let [[name bindings body] (if (symbol? name-or-bindings)
                               [[name-or-bindings] bindings? body]
                               [nil name-or-bindings (cons bindings? body)])]
    (assert (vector? bindings) "forward-ref requires a vector for its bindings")
    (assert (= 2 (count bindings)) "forward-ref requires bindings of [props ref]")
    `(~'.forwardRef ~'js/React (fn ~@name ~bindings
                                 ~@body))))
