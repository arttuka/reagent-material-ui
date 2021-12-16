(ns reagent-mui.icons.temple-hindu-outlined
  "Imports @mui/icons-material/TempleHinduOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def temple-hindu-outlined (create-svg-icon (e "path" #js {"d" "M20 11v2h-2L15 3V1h-2v2h-2.03V1h-2v2.12L6 13H4v-2H2v11h9v-5h2v5h9V11h-2zm-4.69 0H8.69l.6-2h5.42l.6 2zm-1.2-4H9.89l.6-2h3.02l.6 2zM20 20h-5v-5H9v5H4v-5h3.49l.6-2h7.82l.6 2H20v5z"})
                                            "TempleHinduOutlined"))
