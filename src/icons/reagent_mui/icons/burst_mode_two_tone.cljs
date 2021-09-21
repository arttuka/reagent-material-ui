(ns reagent-mui.icons.burst-mode-two-tone
  "Imports @mui/icons-material/BurstModeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def burst-mode-two-tone (create-svg-icon [(e "path" #js {"d" "M11 17h10V7H11v10zm3-3.53 1.43 1.72 2-2.58L20 15.99h-8l2-2.52z", "opacity" ".3"}) (e "path" #js {"d" "M1 5h2v14H1zm4 0h2v14H5zm17 0H10c-.55 0-1 .45-1 1v12c0 .55.45 1 1 1h12c.55 0 1-.45 1-1V6c0-.55-.45-1-1-1zm-1 12H11V7h10v10zm-3.57-4.38-2 2.57L14 13.47l-2 2.52h8z"})]
                                          "BurstModeTwoTone"))
