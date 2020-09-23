(ns reagent-material-ui.pickers.localization-provider
  "Imports @material-ui/pickers/LocalizationProvider as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/LocalizationProvider/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def localization-provider (adapt-react-class (.-LocalizationProvider pickers) "mui-localization-provider"))
