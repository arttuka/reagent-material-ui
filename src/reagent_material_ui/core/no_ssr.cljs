(ns reagent-material-ui.core.no-ssr
  "Imports @material-ui/core/NoSsr as a Reagent component.
   Original documentation is at https://material-ui.com/api/no-ssr/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def no-ssr (adapt-react-class (.-NoSsr js/MaterialUI) "mui-no-ssr"))
