(ns reagent-material-ui.icons.local-hospital-rounded
  "Imports @material-ui/icons/LocalHospitalRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-hospital-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-1.99.9-1.99 2L3 19c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-3.5 10.5h-2v2c0 .83-.67 1.5-1.5 1.5s-1.5-.67-1.5-1.5v-2h-2c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5h2v-2c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5v2h2c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5z"})
                                             "LocalHospitalRounded"))
