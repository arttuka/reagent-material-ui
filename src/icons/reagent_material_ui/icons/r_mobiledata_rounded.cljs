(ns reagent-material-ui.icons.r-mobiledata-rounded
  "Imports @material-ui/icons/RMobiledataRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def r-mobiledata-rounded (create-svg-icon (e "path" #js {"d" "m7.8 7.2.65 1.52c.26.61-.18 1.28-.84 1.28-.37 0-.7-.22-.85-.56l-.89-2.11H4v1.75c0 .51-.41.92-.92.92h-.16C2.41 10 2 9.59 2 9.08V3c0-.55.45-1 1-1h4c1.1 0 2 .9 2 2v1.33c0 .8-.53 1.54-1.2 1.87zM7 4H4v1.33h3V4z"})
                                           "RMobiledataRounded"))
