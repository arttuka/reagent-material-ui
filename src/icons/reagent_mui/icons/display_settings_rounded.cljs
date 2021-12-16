(ns reagent-mui.icons.display-settings-rounded
  "Imports @mui/icons-material/DisplaySettingsRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def display-settings-rounded (create-svg-icon [(e "path" #js {"d" "M20 3H4c-1.1 0-2 .9-2 2v12c0 1.1.89 2 2 2h4v1c0 .55.45 1 1 1h6c.55 0 1-.45 1-1v-1h4c1.1 0 2-.9 2-2V5c0-1.11-.9-2-2-2zm0 14H4V5h16v12z"}) (e "path" #js {"d" "M6 8.25h8v1.5H6zm10.5 1.5H18v-1.5h-1.5V7H15v4h1.5zm-6.5 2.5h8v1.5h-8zM7.5 15H9v-4H7.5v1.25H6v1.5h1.5z"})]
                                               "DisplaySettingsRounded"))
