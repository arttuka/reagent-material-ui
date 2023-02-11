(ns reagent-mui.x.localization-provider-pro
  "Imports @mui/x-date-pickers-pro/LocalizationProvider as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/localization-provider/ ."
  (:require [reagent.core :as r]
            ["@mui/x-date-pickers-pro/LocalizationProvider" :as MuiLocalizationProvider]))

(def localization-provider (r/adapt-react-class MuiLocalizationProvider/LocalizationProvider))
