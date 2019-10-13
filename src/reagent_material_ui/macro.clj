(ns reagent-material-ui.macro)

(defmacro e
  "Wrapper for React.createElement"
  [component props & children]
  `(~'.createElement ~'js/React ~component ~props ~@children))
