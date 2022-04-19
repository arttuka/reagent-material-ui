(ns reagent-mui.styles
  "Imports some styles related helpers and components from @mui/material/styles.
   Original documentation is at https://mui.com/styles/basics/ ."
  (:require [reagent.core :as r]
            ["@mui/material/styles" :as mui-styles]
            [reagent-mui.util :as util]))

(def ^:private theme-provider* (util/adapt-react-class mui-styles/ThemeProvider "mui-theme-provider"))
(def ^:private experimental-css-vars-provider* (util/adapt-react-class mui-styles/Experimental_CssVarsProvider "mui-experimental-css-vars-provider"))

(defn styled
  "The styled-components pattern. Takes a component and a styles-generating function or a styles object.
   Creates and returns a new component and gives the input component a `:class-name` prop for applying styles.
   Note: input component has to take all its props (including children) in a single map."
  ([component styles]
   (styled component {} styles))
  ([component opts styles]
   (let [react-component (if (string? component)
                           component
                           (util/reactify-component component))
         styled-component (mui-styles/styled react-component (clj->js opts))]
     (util/adapt-react-class
      (styled-component (util/wrap-styles styles))))))

(defn responsive-font-sizes
  "Takes a theme object and enhances it with responsive font options
   Options may optionally be passed in to override the defaults provided by Material-UI
   See: https://mui.com/material-ui/customization/theming/#responsivefontsizes-theme-options-theme"
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

(defn experimental-css-vars-provider
  "Experimental provider for the theme to inject styles into Material UI components.
   In addition to providing the theme in the inner React context,
   this new provider also generates CSS variables out of all tokens in the theme
   that are not functions, and makes them available in the context as well.
   Currently only supported by the Button component.
   See: https://mui.com/material-ui/experimental-api/css-variables/"
  [props & children]
  (into [experimental-css-vars-provider* props]
        (map r/as-element children)))

(defn use-color-scheme
  "Hook that provides the current mode and setMode function for experimental-css-vars-provider.
  See: https://mui.com/material-ui/experimental-api/css-variables/"
  []
  (util/js->clj' (mui-styles/useColorScheme)))

(defn create-theme
  "Takes an incomplete theme object and adds the missing parts"
  [options]
  (util/js->clj' (mui-styles/createTheme (util/clj->js' options))))
