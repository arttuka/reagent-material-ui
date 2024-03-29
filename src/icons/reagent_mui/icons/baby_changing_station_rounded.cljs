(ns reagent-mui.icons.baby-changing-station-rounded
  "Imports @mui/icons-material/BabyChangingStationRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def baby-changing-station-rounded (create-svg-icon (e "path" #js {"d" "M14 9c0 .55-.45 1-1 1h-1.58c-.28 0-.55-.06-.8-.17l-2.3-1.01L7 12.75V21c0 .55-.45 1-1 1H4c-.55 0-1-.45-1-1v-8.67c0-.22.04-.44.11-.65l1.48-4.32c.37-1.11 1.63-1.67 2.71-1.18l4.15 1.83L13 8c.55 0 1 .45 1 1zM8 1c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm2 18h10c.55 0 1-.45 1-1s-.45-1-1-1H10c-.55 0-1 .45-1 1s.45 1 1 1zm9.5-3c.83 0 1.5-.67 1.5-1.5s-.67-1.5-1.5-1.5-1.5.67-1.5 1.5.67 1.5 1.5 1.5zM13 12c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1s.45 1 1 1h1v1c0 1.1.9 2 2 2h2c1.1 0 2-.9 2-2v-2c0-.55-.45-1-1-1s-1 .45-1 1v1h-2v-1z"})
                                                    "BabyChangingStationRounded"))
