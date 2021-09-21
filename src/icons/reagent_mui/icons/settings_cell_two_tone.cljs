(ns reagent-mui.icons.settings-cell-two-tone
  "Imports @mui/icons-material/SettingsCellTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def settings-cell-two-tone (create-svg-icon [(e "path" #js {"d" "M8 17h8v1H8zM8 2h8v1H8z", "opacity" ".3"}) (e "path" #js {"d" "M7 22h2v2H7zm4 0h2v2h-2zm4 0h2v2h-2zM16 .01 8 0C6.9 0 6 .9 6 2v16c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V2c0-1.1-.9-1.99-2-1.99zM16 18H8v-1h8v1zm0-3H8V5h8v10zm0-12H8V2h8v1z"})]
                                             "SettingsCellTwoTone"))
