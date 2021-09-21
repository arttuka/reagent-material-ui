(ns reagent-mui.icons.edgesensor-low-two-tone
  "Imports @mui/icons-material/EdgesensorLowTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def edgesensor-low-two-tone (create-svg-icon [(e "path" #js {"d" "M8 4h8v1H8zm0 15h8v1H8z", "opacity" ".3"}) (e "path" #js {"d" "M20 10h2v7h-2zM2 7h2v7H2zm14-4.99L8 2c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V4c0-1.1-.9-1.99-2-1.99zM16 20H8v-1h8v1zm0-3H8V7h8v10zm0-12H8V4h8v1z"})]
                                              "EdgesensorLowTwoTone"))
