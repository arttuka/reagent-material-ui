(ns reagent-mui.icons.edit-location-alt-outlined
  "Imports @mui/icons-material/EditLocationAltOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def edit-location-alt-outlined (create-svg-icon (e "path" #js {"d" "M11 11h2.12l6.16-6.16-2.12-2.12L11 8.88V11zm9.71-9L20 1.29a.9959.9959 0 0 0-1.41 0l-.72.72 2.12 2.12.72-.72c.39-.39.39-1.02 0-1.41zM17.9 9.05c.06.36.1.74.1 1.15 0 1.71-1.08 4.64-6 9.14-4.92-4.49-6-7.43-6-9.14C6 6.17 9.09 4 12 4c.32 0 .65.03.97.08l1.65-1.65C13.78 2.16 12.9 2 12 2c-4.2 0-8 3.22-8 8.2 0 3.32 2.67 7.25 8 11.8 5.33-4.55 8-8.48 8-11.8 0-1.01-.16-1.94-.45-2.8L17.9 9.05z"})
                                                 "EditLocationAltOutlined"))
