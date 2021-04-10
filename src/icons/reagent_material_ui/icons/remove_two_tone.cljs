(ns reagent-material-ui.icons.remove-two-tone
  "Imports @material-ui/icons/RemoveTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def remove-two-tone (create-svg-icon (e "path" #js {"d" "M19 13H5v-2h14v2z"})
                                      "RemoveTwoTone"))
