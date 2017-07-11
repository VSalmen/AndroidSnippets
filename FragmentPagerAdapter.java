/*
Removing fragments from adapter
https://stackoverflow.com/questions/9061325/fragmentpageradapter-is-not-removing-items-fragments-correctly
*/
  @Override
      public void destroyItem(ViewGroup container, int position, Object object) {
          if (position < getCount()) {
              FragmentManager manager = ((Fragment) object).getFragmentManager();
              FragmentTransaction trans = manager.beginTransaction();
              trans.remove((Fragment) object);
              trans.commit();
          }
      }
  @Override
  public int getItemPosition(Object object) {
      if (workouts.contains(object)) return workouts.indexOf(object);
      else return POSITION_NONE;
  }
