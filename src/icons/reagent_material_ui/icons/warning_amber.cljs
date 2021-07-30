(ns reagent-material-ui.icons.warning-amber
  "Imports @material-ui/icons/WarningAmber as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def warning-amber (create-svg-icon [(e "path" #js {"d" "M12 5.99 19.53 19H4.47L12 5.99M12 2 1 21h22L12 2z"}) (e "path" #js {"d" "M13 16h-2v2h2zm0-6h-2v5h2z"})]
                                    "WarningAmber"))
