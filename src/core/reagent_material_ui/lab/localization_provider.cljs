(ns reagent-material-ui.lab.localization-provider
  "Imports @material-ui/lab/LocalizationProvider as a Reagent component.
   Original documentation is at https://material-ui.com/api/localization-provider/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/LocalizationProvider" :as MuiLocalizationProvider]))

(def localization-provider (adapt-react-class (.-default MuiLocalizationProvider) "mui-localization-provider"))
