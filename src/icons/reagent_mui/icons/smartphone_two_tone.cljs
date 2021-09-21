(ns reagent-mui.icons.smartphone-two-tone
  "Imports @mui/icons-material/SmartphoneTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def smartphone-two-tone (create-svg-icon [(e "path" #js {"d" "M7 5h10v14H7z", "opacity" ".3"}) (e "path" #js {"d" "M17 1.01 7 1c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V3c0-1.1-.9-1.99-2-1.99zM17 19H7V5h10v14z"})]
                                          "SmartphoneTwoTone"))
