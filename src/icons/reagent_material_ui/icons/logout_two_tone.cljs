(ns reagent-material-ui.icons.logout-two-tone
  "Imports @material-ui/icons/LogoutTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def logout-two-tone (create-svg-icon (e "path" #js {"d" "M5 5h7V3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h7v-2H5V5zm16 7l-4-4v3H9v2h8v3l4-4z"})
                                      "LogoutTwoTone"))
