(ns reagent-material-ui.jss-styles
  "Imports some styles related helpers and components from @material-ui/styles.
   Original documentation is at https://material-ui.com/styles/basics/ ."
  (:require [reagent.core :as r]
            ["@material-ui/styles" :as mui-styles]
            [reagent-material-ui.util :as util]))

(def ^:private styles-provider* (util/adapt-react-class mui-styles/StylesProvider "mui-styles-provider"))

(defn make-styles
  "Takes a styles-generating function or a styles object.
   Returns a React hook which accepts a props object and returns the mapping from styles to class names.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks"
  ([styles]
   (make-styles styles {}))
  ([styles opts]
   (let [use-styles (mui-styles/makeStyles (util/wrap-styles styles) (clj->js opts))]
     (util/wrap-js-function use-styles))))

(defn with-styles
  "Takes a styles-generating function or a styles object.
   Returns a higher-order component that wraps another component and adds a `:classes` prop to it.
   Note: input component has to take all its props (including children) in a single map."
  ([styles]
   (with-styles styles {}))
  ([styles opts]
   (let [hoc (mui-styles/withStyles (util/wrap-styles styles) (clj->js opts))]
     (partial util/apply-hoc hoc))))

(defn styled
  "The styled-components pattern. Takes a component and a styles-generating function or a styles object.
   Creates and returns a new component and gives the input component a `:class-name` prop for applying styles.
   Note: input component has to take all its props (including children) in a single map."
  ([component styles]
   (styled component styles {}))
  ([component styles opts]
   (let [styled-component (mui-styles/styled (util/reactify-component component))]
     (util/adapt-react-class
      (styled-component (util/wrap-styles styles) (clj->js opts))))))

(defn with-theme
  "Higher order component that provides the theme object as a prop to the input component.
   Note: input component has to take all its props (including children) in a single map."
  [component]
  (util/apply-hoc mui-styles/withTheme component))

(defn styles-provider
  "This component allows you to change the behavior of the styling solution. It makes the options available down the React tree thanks to the context.
  It should preferably be used at the root of your component tree."
  [opts & children]
  (into [styles-provider* opts]
        (map r/as-element children)))
