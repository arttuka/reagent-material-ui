(ns reagent-mui.icons.change-history-two-tone
  "Imports @mui/icons-material/ChangeHistoryTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def change-history-two-tone (create-svg-icon [(e "path" #js {"d" "M12 7.77 5.61 18h12.78z", "opacity" ".3"}) (e "path" #js {"d" "M12 4 2 20h20L12 4zm0 3.77L18.39 18H5.61L12 7.77z"})]
                                              "ChangeHistoryTwoTone"))
