(ns reagent-material-ui.icons.move-to-inbox-rounded
  "Imports @material-ui/icons/MoveToInboxRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def move-to-inbox-rounded (create-svg-icon (e "path" #js {"d" "M19 3H4.99C3.88 3 3 3.9 3 5v14c0 1.1.88 2 1.99 2H19c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 12h-3.13c-.47 0-.85.34-.98.8-.35 1.27-1.52 2.2-2.89 2.2s-2.54-.93-2.89-2.2c-.13-.46-.51-.8-.98-.8H4.99V6c0-.55.45-1 1-1H18c.55 0 1 .45 1 1v9zm-3-5h-2V7h-4v3H8l3.65 3.65c.2.2.51.2.71 0L16 10z"})
                                            "MoveToInboxRounded"))
