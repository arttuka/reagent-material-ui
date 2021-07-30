(ns reagent-material-ui.icons.hvac-rounded
  "Imports @material-ui/icons/HvacRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hvac-rounded (create-svg-icon [(e "path" #js {"d" "M12 16c1.01 0 1.91-.39 2.62-1H9.38c.71.61 1.61 1 2.62 1zm-3.44-2h6.89c.26-.45.44-.96.51-1.5h-7.9c.06.54.23 1.05.5 1.5zM12 8c-1.01 0-1.91.39-2.62 1h5.24c-.71-.61-1.61-1-2.62-1zm-3.44 2c-.26.45-.44.96-.51 1.5h7.9c-.07-.54-.24-1.05-.51-1.5H8.56z"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-7 15c-3.31 0-6-2.69-6-6s2.69-6 6-6 6 2.69 6 6-2.69 6-6 6z"})]
                                   "HvacRounded"))
