(ns reagent-material-ui.icons.view-comfy-two-tone
  "Imports @material-ui/icons/ViewComfyTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-comfy-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M9.25 11h2.25v2H9.25zm0 4h2.25v2H9.25zm0-8h2.25v2H9.25zm4.25 8h2.25v2H13.5zM5 15h2.25v2H5zm0-4h2.25v2H5zm0-4h2.25v2H5zm12.75 0H20v2h-2.25zm-4.25 4h2.25v2H13.5zm0-4h2.25v2H13.5zm4.25 8H20v2h-2.25zm0-4H20v2h-2.25z", "opacity" ".3"}) (e "path" #js {"d" "M3 5v14h19V5H3zm4.25 12H5v-2h2.25v2zm0-4H5v-2h2.25v2zm0-4H5V7h2.25v2zm4.25 8H9.25v-2h2.25v2zm0-4H9.25v-2h2.25v2zm0-4H9.25V7h2.25v2zm4.25 8H13.5v-2h2.25v2zm0-4H13.5v-2h2.25v2zm0-4H13.5V7h2.25v2zM20 17h-2.25v-2H20v2zm0-4h-2.25v-2H20v2zm0-4h-2.25V7H20v2z"}))
                                          "ViewComfyTwoTone"))
