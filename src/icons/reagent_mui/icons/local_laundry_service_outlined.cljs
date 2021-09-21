(ns reagent-mui.icons.local-laundry-service-outlined
  "Imports @mui/icons-material/LocalLaundryServiceOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-laundry-service-outlined (create-svg-icon [(e "path" #js {"d" "M18 2.01 6 2c-1.11 0-2 .89-2 2v16c0 1.11.89 2 2 2h12c1.11 0 2-.89 2-2V4c0-1.11-.89-1.99-2-1.99zM18 20H6L5.99 4H18v16z"}) (e "circle" #js {"cx" "8", "cy" "6", "r" "1"}) (e "circle" #js {"cx" "11", "cy" "6", "r" "1"}) (e "path" #js {"d" "M12 19c2.76 0 5-2.24 5-5s-2.24-5-5-5-5 2.24-5 5 2.24 5 5 5zm2.36-7.36c1.3 1.3 1.3 3.42 0 4.72-1.3 1.3-3.42 1.3-4.72 0l4.72-4.72z"})]
                                                     "LocalLaundryServiceOutlined"))
