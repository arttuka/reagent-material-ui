(ns reagent-mui.icons.view-comfy-outlined
  "Imports @mui/icons-material/ViewComfyOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-comfy-outlined (create-svg-icon (e "path" #js {"d" "M2 4v16h20V4H2zm2 2h16v5H4V6zm0 12v-5h4v5H4zm6 0v-5h10v5H10z"})
                                          "ViewComfyOutlined"))
