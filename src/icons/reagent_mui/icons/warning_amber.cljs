(ns reagent-mui.icons.warning-amber
  "Imports @mui/icons-material/WarningAmber as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def warning-amber (create-svg-icon [(e "path" #js {"d" "M12 5.99 19.53 19H4.47L12 5.99M12 2 1 21h22L12 2z"}) (e "path" #js {"d" "M13 16h-2v2h2zm0-6h-2v5h2z"})]
                                    "WarningAmber"))
