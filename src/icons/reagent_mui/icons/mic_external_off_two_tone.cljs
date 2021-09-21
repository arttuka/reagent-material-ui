(ns reagent-mui.icons.mic-external-off-two-tone
  "Imports @mui/icons-material/MicExternalOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mic-external-off-two-tone (create-svg-icon [(e "path" #js {"d" "m6.21 10 .6 6h.38l.54-5.44-.56-.56z", "opacity" ".3"}) (e "path" #js {"d" "M10 5c0-1.66-1.34-3-3-3-.62 0-1.19.19-1.67.5l4.15 4.15C9.8 6.18 10 5.61 10 5zm4 1c0-1.1.9-2 2-2s2 .9 2 2v9.17l2 2V6c0-2.21-1.79-4-4-4s-4 1.79-4 4v3.17l2 2V6zM2.1 2.1.69 3.51 5.17 8H4l1 10h1c0 2.21 1.79 4 4 4s4-1.79 4-4v-1.17l6.49 6.49 1.41-1.41L2.1 2.1zM7.19 16h-.38l-.6-6h.96l.56.56L7.19 16zM12 18c0 1.1-.9 2-2 2s-2-.9-2-2h1l.56-5.61L12 14.83V18z"})]
                                                "MicExternalOffTwoTone"))
