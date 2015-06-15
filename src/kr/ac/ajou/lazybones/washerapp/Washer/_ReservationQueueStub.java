package kr.ac.ajou.lazybones.washerapp.Washer;


/**
* kr/ac/ajou/lazybones/washerapp/Washer/_ReservationQueueStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from washer.idl
* 2015년 6월 15일 월요일 오후 4시 53분 58초 KST
*/

public class _ReservationQueueStub extends org.omg.CORBA.portable.ObjectImpl implements kr.ac.ajou.lazybones.washerapp.Washer.ReservationQueue
{

  public kr.ac.ajou.lazybones.washerapp.Washer.Reservation[] reservations ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("reservations", true);
                $in = _invoke ($out);
                kr.ac.ajou.lazybones.washerapp.Washer.Reservation $result[] = kr.ac.ajou.lazybones.washerapp.Washer.ReservationSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return reservations (        );
            } finally {
                _releaseReply ($in);
            }
  } // reservations

  public kr.ac.ajou.lazybones.washerapp.Washer.Reservation[] reservationsBy (String who)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("reservationsBy", true);
                $out.write_string (who);
                $in = _invoke ($out);
                kr.ac.ajou.lazybones.washerapp.Washer.Reservation $result[] = kr.ac.ajou.lazybones.washerapp.Washer.ReservationSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return reservationsBy (who        );
            } finally {
                _releaseReply ($in);
            }
  } // reservationsBy

  public kr.ac.ajou.lazybones.washerapp.Washer.Reservation[] reservationWaitingTimes ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("reservationWaitingTimes", true);
                $in = _invoke ($out);
                kr.ac.ajou.lazybones.washerapp.Washer.Reservation $result[] = kr.ac.ajou.lazybones.washerapp.Washer.ReservationSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return reservationWaitingTimes (        );
            } finally {
                _releaseReply ($in);
            }
  } // reservationWaitingTimes

  public kr.ac.ajou.lazybones.washerapp.Washer.Reservation[] reservationWaitingTimesBy (String who)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("reservationWaitingTimesBy", true);
                $out.write_string (who);
                $in = _invoke ($out);
                kr.ac.ajou.lazybones.washerapp.Washer.Reservation $result[] = kr.ac.ajou.lazybones.washerapp.Washer.ReservationSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return reservationWaitingTimesBy (who        );
            } finally {
                _releaseReply ($in);
            }
  } // reservationWaitingTimesBy

  public int size ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("size", true);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return size (        );
            } finally {
                _releaseReply ($in);
            }
  } // size

  public boolean enqueue (String who, long duration)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("enqueue", true);
                $out.write_string (who);
                $out.write_longlong (duration);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return enqueue (who, duration        );
            } finally {
                _releaseReply ($in);
            }
  } // enqueue

  public kr.ac.ajou.lazybones.washerapp.Washer.Reservation dequeue ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("dequeue", true);
                $in = _invoke ($out);
                kr.ac.ajou.lazybones.washerapp.Washer.Reservation $result = kr.ac.ajou.lazybones.washerapp.Washer.ReservationHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return dequeue (        );
            } finally {
                _releaseReply ($in);
            }
  } // dequeue

  public boolean isEmpty ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("isEmpty", true);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return isEmpty (        );
            } finally {
                _releaseReply ($in);
            }
  } // isEmpty

  public boolean remove (int index)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove", true);
                $out.write_long (index);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return remove (index        );
            } finally {
                _releaseReply ($in);
            }
  } // remove

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Washer/ReservationQueue:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ReservationQueueStub
