(ns reagent-material-ui.icons.phone-iphone-sharp
  "Imports @material-ui/icons/PhoneIphoneSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def phone-iphone-sharp (create-svg-icon (e "path" #js {"d" "M18 1H5v22h13V1zm-6.5 21c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5zm4.5-4H7V4h9v14z"})
                                         "PhoneIphoneSharp"))
