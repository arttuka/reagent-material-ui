(ns reagent-material-ui.icons.signal-cellular-1-bar
  "Imports @material-ui/icons/SignalCellular1Bar as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def signal-cellular-1-bar (create-svg-icon (e "React.Fragment" nil (e "path" #js {"fillOpacity" ".3", "d" "M2 22h20V2z"}) (e "path" #js {"d" "M12 12L2 22h10z"}))
                                            "SignalCellular1Bar"))
