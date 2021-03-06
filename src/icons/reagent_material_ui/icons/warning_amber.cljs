(ns reagent-material-ui.icons.warning-amber
  "Imports @material-ui/icons/WarningAmber as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def warning-amber (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 5.99L19.53 19H4.47L12 5.99M12 2L1 21h22L12 2z"}) (e "path" #js {"d" "M13 16h-2v2h2zm0-6h-2v5h2z"}))
                                    "WarningAmber"))
