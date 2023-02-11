(ns reagent-mui.icons.view-comfy-two-tone
  "Imports @mui/icons-material/ViewComfyTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-comfy-two-tone (create-svg-icon [(e "path" #js {"d" "M10 18h10v-5H10v5zM4 6v5h16V6H4zm0 12h4v-5H4v5z", "opacity" ".3"}) (e "path" #js {"d" "M2 4v16h20V4H2zm6 14H4v-5h4v5zm12 0H10v-5h10v5zm0-7H4V6h16v5z"})]
                                          "ViewComfyTwoTone"))
