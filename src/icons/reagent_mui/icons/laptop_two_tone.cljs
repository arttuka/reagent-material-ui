(ns reagent-mui.icons.laptop-two-tone
  "Imports @mui/icons-material/LaptopTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def laptop-two-tone (create-svg-icon [(e "path" #js {"d" "M4 6h16v10H4V6z", "opacity" ".3"}) (e "path" #js {"d" "M20 18c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2H0v2h24v-2h-4zM4 6h16v10H4V6z"})]
                                      "LaptopTwoTone"))
