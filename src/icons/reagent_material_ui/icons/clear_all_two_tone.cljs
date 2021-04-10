(ns reagent-material-ui.icons.clear-all-two-tone
  "Imports @material-ui/icons/ClearAllTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def clear-all-two-tone (create-svg-icon (e "path" #js {"d" "M5 11h14v2H5zm-2 4h14v2H3zm4-8h14v2H7z"})
                                         "ClearAllTwoTone"))
