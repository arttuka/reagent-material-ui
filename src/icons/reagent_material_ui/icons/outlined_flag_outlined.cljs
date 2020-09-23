(ns reagent-material-ui.icons.outlined-flag-outlined
  "Imports @material-ui/icons/OutlinedFlagOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def outlined-flag-outlined (create-svg-icon (e "path" #js {"d" "M14 6l-1-2H5v17h2v-7h5l1 2h7V6h-6zm4 8h-4l-1-2H7V6h5l1 2h5v6z"})
                                             "OutlinedFlagOutlined"))
