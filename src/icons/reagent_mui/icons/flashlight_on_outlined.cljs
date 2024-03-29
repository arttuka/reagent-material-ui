(ns reagent-mui.icons.flashlight-on-outlined
  "Imports @mui/icons-material/FlashlightOnOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def flashlight-on-outlined (create-svg-icon [(e "path" #js {"d" "M18 2H6v6l2 3v11h8V11l2-3V2zm-2 2v1H8V4h8zm-2 6.4V20h-4v-9.61l-2-3V7h8v.39l-2 3.01z"}) (e "circle" #js {"cx" "12", "cy" "14", "r" "1.5"})]
                                             "FlashlightOnOutlined"))
