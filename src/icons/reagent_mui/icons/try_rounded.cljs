(ns reagent-mui.icons.try-rounded
  "Imports @mui/icons-material/TryRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def try-rounded (create-svg-icon (e "path" #js {"d" "M20 2H4c-1.1 0-2 .9-2 2v15.59c0 .89 1.08 1.34 1.71.71L6 18h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-6.43 9.57-1.12 2.44c-.18.39-.73.39-.91 0l-1.12-2.44-2.44-1.12c-.39-.18-.39-.73 0-.91l2.44-1.12 1.12-2.44c.18-.39.73-.39.91 0l1.12 2.44 2.44 1.12c.39.18.39.73 0 .91l-2.44 1.12z"})
                                  "TryRounded"))
