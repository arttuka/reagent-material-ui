(ns reagent-mui.styles
  "Imports some styles related helpers and components from @mui/material/styles.
   Original documentation is at https://mui.com/styles/basics/ ."
  (:require [reagent.core :as r]
            ["@mui/material/styles" :as mui-styles]
            [reagent-mui.util :as util]))

(def ^:private theme-provider* (util/adapt-react-class mui-styles/ThemeProvider "mui-theme-provider"))

(defn styled
  "The styled-components pattern. Takes a component and a styles-generating function or a styles object.
   Creates and returns a new component and gives the input component a `:class-name` prop for applying styles.
   Note: input component has to take all its props (including children) in a single map."
  ([component styles]
   (styled component {} styles))
  ([component opts styles]
   (let [styled-component (mui-styles/styled (util/reactify-component component) (clj->js opts))]
     (util/adapt-react-class
      (styled-component (util/wrap-styles styles))))))

(defn responsive-font-sizes
  "Takes a theme object and enhances it with responsive font options
   Options may optionally be passed in to override the defaults provided by Material-UI
   See: https://mui.com/customization/theming/#responsivefontsizes-theme-options-theme"
  ([theme]
   (responsive-font-sizes theme {}))
  ([theme options]
   (util/js->clj' (mui-styles/responsiveFontSizes (util/clj->js' theme) (util/clj->js' options)))))

(defn use-theme
  "React hook that returns the theme object.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks"
  []
  (util/js->clj' (mui-styles/useTheme)))

(defn theme-provider
  "Component that takes a theme object and makes it available in child components.
   It should preferably be used at the root of your component tree."
  [theme & children]
  (into [theme-provider* {:theme theme}]
        (map r/as-element children)))

(defn create-theme
  "Takes an incomplete theme object and adds the missing parts"
  [options]
  (util/js->clj' (mui-styles/createTheme (util/clj->js' options))))

