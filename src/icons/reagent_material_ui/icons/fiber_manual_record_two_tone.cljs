(ns reagent-material-ui.icons.fiber-manual-record-two-tone
  "Imports @material-ui/icons/FiberManualRecordTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fiber-manual-record-two-tone (create-svg-icon [(e "path" #js {"d" "M12 18c3.31 0 6-2.69 6-6s-2.69-6-6-6-6 2.69-6 6 2.69 6 6 6z", "opacity" ".3"}) (e "path" #js {"d" "M12 20c4.42 0 8-3.58 8-8s-3.58-8-8-8-8 3.58-8 8 3.58 8 8 8zm0-14c3.31 0 6 2.69 6 6s-2.69 6-6 6-6-2.69-6-6 2.69-6 6-6z"})]
                                                   "FiberManualRecordTwoTone"))
