(ns reagent-material-ui.icons.local-hospital-rounded
  "Imports @material-ui/icons/LocalHospitalRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-hospital-rounded (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-1.99.9-1.99 2L3 19c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-2 11h-3v3c0 .55-.45 1-1 1h-2c-.55 0-1-.45-1-1v-3H7c-.55 0-1-.45-1-1v-2c0-.55.45-1 1-1h3V7c0-.55.45-1 1-1h2c.55 0 1 .45 1 1v3h3c.55 0 1 .45 1 1v2c0 .55-.45 1-1 1z"})
                                             "LocalHospitalRounded"))
