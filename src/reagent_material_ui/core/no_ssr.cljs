(ns reagent-material-ui.core.no-ssr
  "Imports @material-ui/core/NoSsr as a Reagent component.
   Original documentation is at https://material-ui.com/api/no-ssr/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def no-ssr (r/adapt-react-class (.-NoSsr js/MaterialUI)))
