(ns reagent-material-ui.icons.phone-iphone-rounded
  "Imports @material-ui/icons/PhoneIphoneRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def phone-iphone-rounded (create-svg-icon (e "path" #js {"d" "M17 1H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm-5 19.5c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm5-4.5H7V6h10v10z"})
                                           "PhoneIphoneRounded"))
