(ns reagent-material-ui.icons.door-back-outlined
  "Imports @material-ui/icons/DoorBackOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def door-back-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 19V5c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v14H3v2h18v-2h-2zm-2 0H7V5h10v14z"}) (e "path" #js {"d" "M9 11h2v2H9z"}))
                                         "DoorBackOutlined"))
