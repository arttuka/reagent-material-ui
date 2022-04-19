(ns reagent-mui.x.localization-provider
  "Imports @mui/x-date-pickers/LocalizationProvider as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/localization-provider/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/LocalizationProvider" :as MuiLocalizationProvider]))

(def localization-provider (adapt-react-class (.-LocalizationProvider MuiLocalizationProvider) "mui-localization-provider"))
