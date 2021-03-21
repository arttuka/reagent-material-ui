(ns reagent-material-ui.icons.next-plan-rounded
  "Imports @material-ui/icons/NextPlanRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def next-plan-rounded (create-svg-icon (e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm5.5 12h-3.29c-.45 0-.67-.54-.35-.85l.9-.9c-.63-1.05-1.79-1.76-3.12-1.76-1.73 0-3.17 1.17-3.54 2.74-.12.45-.52.77-.98.77-.65 0-1.12-.61-.97-1.24.58-2.44 2.81-4.27 5.48-4.27 1.88 0 3.55.92 4.57 2.31l.95-.95c.31-.31.85-.09.85.36v3.29c0 .28-.22.5-.5.5z"})
                                        "NextPlanRounded"))