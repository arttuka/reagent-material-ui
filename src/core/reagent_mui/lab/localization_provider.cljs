(ns reagent-mui.lab.localization-provider
  "Imports @mui/lab/LocalizationProvider as a Reagent component.
   Original documentation is at https://mui.com/api/localization-provider/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/LocalizationProvider" :as MuiLocalizationProvider]))

(def localization-provider (adapt-react-class (.-default MuiLocalizationProvider) "mui-localization-provider"))
