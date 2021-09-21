(ns reagent-mui.icons.shop-2-two-tone
  "Imports @mui/icons-material/Shop2TwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shop-2-two-tone (create-svg-icon [(e "path" #js {"d" "M7 16h14V7H7v9zm5-8 5.5 3.5L12 15V8z", "opacity" ".3"}) (e "path" #js {"d" "M3 9H1v11c0 1.11.89 2 2 2h16v-2H3V9z"}) (e "path" #js {"d" "M18 5V3c0-1.11-.89-2-2-2h-4c-1.11 0-2 .89-2 2v2H5v11c0 1.11.89 2 2 2h14c1.11 0 2-.89 2-2V5h-5zm-6-2h4v2h-4V3zm9 13H7V7h14v9z"}) (e "path" #js {"d" "M12 8v7l5.5-3.5z"})]
                                      "Shop2TwoTone"))
