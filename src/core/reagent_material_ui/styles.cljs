(ns reagent-material-ui.styles
  "Imports some styles related helpers and components from @material-ui/core/styles.
   Original documentation is at https://material-ui.com/styles/basics/ ."
  (:require [reagent.core :as r]
            ["@material-ui/core/styles" :as mui-styles]
            [reagent-material-ui.util :as util]))

(def ^:private theme-provider* (util/adapt-react-class mui-styles/MuiThemeProvider "mui-theme-provider"))

(defn make-styles
  "Takes a styles-generating function or a styles object.
   Returns a React hook which accepts a props object and returns the mapping from styles to class names.
   Note: React hooks can't be used in regular Reagent components: http://reagent-project.github.io/docs/master/ReactFeatures.html#hooks"
  ([styles]
   (make-styles styles {}))
  ([styles opts]
   (let [use-styles (mui-styles/makeStyles (util/wrap-jss-styles styles) (clj->js opts))]
     (util/wrap-js-function use-styles))))

(defn with-styles
  "Takes a styles-generating function or a styles object.
   Returns a higher-order component that wraps another component and adds a `:classes` prop to it.
   Note: input component has to take all its props (including children) in a single map."
  ([styles]
   (with-styles styles {}))
  ([styles opts]
   (let [hoc (mui-styles/withStyles (util/wrap-jss-styles styles) (clj->js opts))]
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
      (styled-component (util/wrap-jss-styles styles) (clj->js opts))))))

(defn use-theme
  "React hook that returns the theme object.
   Note: React hooks can't be used in regular Reagent components: http://reagent-project.github.io/docs/master/ReactFeatures.html#hooks"
  []
  (util/js->clj' (mui-styles/useTheme)))

(defn with-theme
  "Higher order component that provides the theme object as a prop to the input component.
   Note: input component has to take all its props (including children) in a single map."
  [component]
  (util/apply-hoc mui-styles/withTheme component))

(defn theme-provider
  "Component that takes a theme object and makes it available in child components.
   It should preferably be used at the root of your component tree."
  [theme & children]
  (into [theme-provider* {:theme theme}]
        (map r/as-element children)))

(defn create-mui-theme
  "Takes an incomplete theme object and adds the missing parts"
  [options]
  (util/js->clj' (mui-styles/createMuiTheme (util/clj->js' options))))
