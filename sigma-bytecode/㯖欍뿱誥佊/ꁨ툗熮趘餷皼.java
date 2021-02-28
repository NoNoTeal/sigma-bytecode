public class \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ua068\ud217\u71ae\u8d98\u9937\u76bc {
    public void \ua068\ud217\u71ae\u8d98\u9937\u76bc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7043\u71f1\u1187\ub102\u3d4b\u3d64 p1) {
        var_5_81 : List<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>
        var_6_9C : int
        var_7_10D : \u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f
        var_6_156 : \uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0
        var_8_1A0 : Iterator<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc)
            putfield:\u7043\u71f1\u1187\ub102\u3d4b\u3d64(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u3d4b\u6d69\u1833\u71ae\u6c56\u62da, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc, p1:\u7043\u71f1\u1187\ub102\u3d4b\u3d64)
            putfield:\uf9c5\u1187\ud4fe\uae87\u64ab\u8350(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u3dd3\ub18d\ucef1\u3e75\ud171\u6198, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc, checkcast:\uf9c5\u1187\ud4fe\uae87\u64ab\u8350(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\uf9c5\u1187\ud4fe\uae87\u64ab\u8350.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0[expected:\uf9c5\u1187\ud4fe\uae87\u64ab\u8350](\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1836476516L))))
            var_5_81 = invokeinterface:List<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u183a\u6cfe\u927d\u8350\u8413\ubcb0, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1953653099L))
            putfield:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u8c8a\ub1b9\u5654\ud217\ua61f\u6d99, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc, initobject:ArrayList<E>(ArrayList<E>::<init>, invokeinterface:int(List<E>::size, var_5_81:List<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>)))
            var_6_9C = and:int(ldc:int(19409), ldc:int(-20434))
            
            while (cmplt:boolean(var_6_9C:int, invokeinterface:int(List<E>::size, var_5_81:List<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>))) {
                var_7_10D = invokespecial:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u7330\u36d3\u873d\u52d3\u7bad\u0a06, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc, checkcast:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(List<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>::get, var_5_81:List<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>, var_6_9C:int)))
                
                if (cmpne:boolean(var_7_10D:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f, aconstnull:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f())) {
                    invokeinterface:boolean(List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>::add, getfield:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u8c8a\ub1b9\u5654\ud217\ua61f\u6d99, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc), var_7_10D:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f)
                }
                
                inc:int(var_6_9C, ldc:int(1))
            }
            
            putfield:\u72f1\u7d52\ud12e\u98a4\ud523\u8258(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\ufe34\u6b5f\u9033\u4c04\uc246\u3e75, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc, initobject:\u72f1\u7d52\ud12e\u98a4\ud523\u8258(\u72f1\u7d52\ud12e\u98a4\ud523\u8258::<init>))
            
            if (logicalnot:boolean(invokeinterface:boolean(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u718f\ua6bd\u7d52\u4bc8\u836c\u92ff, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1835365473L)))) {
                if (invokeinterface:boolean(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u718f\ua6bd\u7d52\u4bc8\u836c\u92ff, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1969517665L))) {
                    var_6_156 = invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1969517665L))
                    
                    if (invokeinterface:boolean(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u718f\ua6bd\u7d52\u4bc8\u836c\u92ff, var_6_156:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1835365473L))) {
                        invokevirtual:void(\u72f1\u7d52\ud12e\u98a4\ud523\u8258::\u88c5\ud217\ua068\u8d98\u99f7\u97b7, getfield:\u72f1\u7d52\ud12e\u98a4\ud523\u8258(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\ufe34\u6b5f\u9033\u4c04\uc246\u3e75, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc), var_6_156:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, var_6_156:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1835365473L)))
                    }
                }
            }
            else {
                invokevirtual:void(\u72f1\u7d52\ud12e\u98a4\ud523\u8258::\u88c5\ud217\ua068\u8d98\u99f7\u97b7, getfield:\u72f1\u7d52\ud12e\u98a4\ud523\u8258(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\ufe34\u6b5f\u9033\u4c04\uc246\u3e75, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc), aconstnull:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(), invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1835365473L)))
            }
            
            putfield:List<\u7bad\u4d85\u7ce1\u071d\u873d\u92ee>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u1187\u76bc\u2dcc\u760c\u12b2\u6b0d, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc, initobject:ArrayList<\u7bad\u4d85\u7ce1\u071d\u873d\u92ee>[expected:List<\u7bad\u4d85\u7ce1\u071d\u873d\u92ee>](ArrayList::<init>))
            
            if (invokeinterface:boolean(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u718f\ua6bd\u7d52\u4bc8\u836c\u92ff, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1768977007L))) {
                var_8_1A0 = invokeinterface:Iterator<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>(List<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>::iterator, invokeinterface:List<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u183a\u6cfe\u927d\u8350\u8413\ubcb0, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1768977007L)), ldc:long(1936289382L)))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_8_1A0:Iterator<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>)) {
                    invokeinterface:boolean(List<\u7bad\u4d85\u7ce1\u071d\u873d\u92ee>::add, getfield:List<\u7bad\u4d85\u7ce1\u071d\u873d\u92ee>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u1187\u76bc\u2dcc\u760c\u12b2\u6b0d, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc), invokestatic:\u7bad\u4d85\u7ce1\u071d\u873d\u92ee(\u7bad\u4d85\u7ce1\u071d\u873d\u92ee::\u836c\u647c\u7c6b\u3d4b\ub113\ud523, checkcast:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(Iterator<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>::next, var_8_1A0:Iterator<\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0>))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u12b2\u4e72\u8df4\u67e9\u67e9.\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f \u7330\u36d3\u873d\u52d3\u7bad\u0a06(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0 p0) {
        var_5_B0 : \u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            
            switch (l2i:int(invokevirtual:long(\u6bb9\u51b2\u40a9\ub70c\u4c2b\uc3e3::\u4492\ubb2b\uf9c5\u759a\u69d9\u9937, checkcast:\u6bb9\u51b2\u40a9\ub70c\u4c2b\uc3e3(\u6b0d\u12cb\u156b\u4179\u8bb0.\u6bb9\u51b2\u40a9\ub70c\u4c2b\uc3e3.class, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0[expected:\u6bb9\u51b2\u40a9\ub70c\u4c2b\uc3e3](\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, invokeinterface:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0(\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0::\u71ae\u5654\u6435\u6b5f\ubff1\uc238, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, ldc:long(1835297121L)), ldc:long(1751411826L)))))) {
                case 1986618469:
                    var_5_B0 = initobject:\u8d90\ud171\u7d52\u8d90\u92ee\uae87[expected:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f](\u8d90\ud171\u7d52\u8d90\u92ee\uae87::<init>, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, getfield:\u7043\u71f1\u1187\ub102\u3d4b\u3d64(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u3d4b\u6d69\u1833\u71ae\u6c56\u62da, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc))
                    looporswitchbreak()
                
                case 1936684398:
                    var_5_B0 = initobject:\uc9f6\u946b\u3d4b\u183a\u3e2a\u4d85[expected:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f](\uc9f6\u946b\u3d4b\u183a\u3e2a\u4d85::<init>, p0:\uc229\u4975\u6b5f\u6cfe\u6b0d\u67d0, getfield:\u7043\u71f1\u1187\ub102\u3d4b\u3d64(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u3d4b\u6d69\u1833\u71ae\u6c56\u62da, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc))
                    looporswitchbreak()
                
                default:
                    var_5_B0 = aconstnull:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f()
                    looporswitchbreak()
            }
            
            return:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(var_5_B0:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u12b2\u4e72\u8df4\u67e9\u67e9.\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f> \ub83f\u5d20\uae87\u0c95\u16f6\u0a06() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(invokestatic:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(Collections::unmodifiableList, getfield:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u8c8a\ub1b9\u5654\ud217\ua61f\u6d99, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u12b2\u4e72\u8df4\u67e9\u67e9.\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f> \ub83f\u5d20\uae87\u0c95\u16f6\u0a06(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u4e72\u3a62\uc9f6\ud4fe\ud158\u7330 p0) {
        var_2_5F : int
        var_4_67 : ArrayList<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>
        var_5_72 : Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>
        var_6_AA : \u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_5F = and:int(ldc:int(1437954283), ldc:int(1304028769))
            var_4_67 = initobject:ArrayList<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(ArrayList<E>::<init>)
            var_5_72 = invokeinterface:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>::iterator, getfield:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u8c8a\ub1b9\u5654\ud217\ua61f\u6d99, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1839533821))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_72:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>)) {
                        var_6_AA = checkcast:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(\u12b2\u4e72\u8df4\u67e9\u67e9.\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f.class, invokeinterface:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>::next, var_5_72:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>))
                        
                        if (invokevirtual:boolean(Enum<E>::equals, invokevirtual:\u4e72\u3a62\uc9f6\ud4fe\ud158\u7330(\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f::\u12b2\u5654\u3a62\u51b2\u6fb0\ud51e, var_6_AA:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f), p0:\u4e72\u3a62\uc9f6\ud4fe\ud158\u7330[expected:Object])) {
                            invokeinterface:boolean(List<? extends T>::add, var_4_67:List<? extends T>, var_6_AA:Object[expected:? extends T])
                        }
                        
                        var_2_5F = and:int(var_2_5F:int, ldc:int(1471149155))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(invokestatic:List<Object>(Collections::unmodifiableList, var_4_67:List<? extends T>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u12b2\u4e72\u8df4\u67e9\u67e9.\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f> \ub83f\u5d20\uae87\u0c95\u16f6\u0a06(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56 p0) {
        var_2_7F : int
        var_4_67 : ArrayList<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>
        var_5_72 : Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>
        var_6_B2 : \u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_7F = and:int(ldc:int(1869719532), ldc:int(-1880719911))
            var_4_67 = initobject:ArrayList<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(ArrayList<E>::<init>)
            var_5_72 = invokeinterface:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>::iterator, getfield:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u8c8a\ub1b9\u5654\ud217\ua61f\u6d99, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_7F:int, ldc:int(16)), ldc:int(0))) {
                    var_2_7F = and:int(var_2_7F:int, ldc:int(1331695598))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_72:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>)) {
                        var_6_B2 = checkcast:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(\u12b2\u4e72\u8df4\u67e9\u67e9.\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f.class, invokeinterface:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>::next, var_5_72:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>))
                        
                        if (invokevirtual:boolean(Object::equals, invokevirtual:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56(\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f::\u4c04\u9a18\u67d0\u8640\u4c2b\u071d, var_6_B2:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f), p0:\u6b0d\u3e2a\u98a4\u36d3\u927d\u6c56[expected:Object])) {
                            invokeinterface:boolean(List<? extends T>::add, var_4_67:List<? extends T>, var_6_B2:Object[expected:? extends T])
                        }
                        
                        var_2_7F = and:int(var_2_7F:int, ldc:int(267767500))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_7F:int, ldc:int(268435456)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_7F = and:int(var_2_7F:int, ldc:int(-1786045893))
            }
            
            return:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(invokestatic:List<Object>(Collections::unmodifiableList, var_4_67:List<? extends T>))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8389\u7e3f\u385b\u5d20\u6fb0\u8258() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokevirtual:boolean(\u72f1\u7d52\ud12e\u98a4\ud523\u8258::\uc31c\u47c2\u3711\u927d\u3711\u4492, getfield:\u72f1\u7d52\ud12e\u98a4\ud523\u8258(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\ufe34\u6b5f\u9033\u4c04\uc246\u3e75, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc)))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u72f1\u7d52\ud12e\u98a4\ud523\u8258 \u7d52\u8bb0\u71f1\ua3b4\u7873\ufcaf() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u72f1\u7d52\ud12e\u98a4\ud523\u8258(getfield:\u72f1\u7d52\ud12e\u98a4\ud523\u8258(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\ufe34\u6b5f\u9033\u4c04\uc246\u3e75, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u5d20\u97b7\u8753\u873d\u16f6.\u7bad\u4d85\u7ce1\u071d\u873d\u92ee> \uc3e3\ud7e8\uc31c\u62da\u3504\ubcb0() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:List<\u7bad\u4d85\u7ce1\u071d\u873d\u92ee>(invokestatic:List<\u7bad\u4d85\u7ce1\u071d\u873d\u92ee>(Collections::unmodifiableList, getfield:List<\u7bad\u4d85\u7ce1\u071d\u873d\u92ee>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u1187\u76bc\u2dcc\u760c\u12b2\u6b0d, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Date \u4c04\u62da\ub18d\u9255\u516c\u516c() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Date(invokestatic:Date(\u3a62\u4daf\u759a\u36d3\u7873\u4179::\ufe34\u8308\u6bb9\u8753\u8d98\ud7e8, invokevirtual:long(\uf9c5\u1187\ud4fe\uae87\u64ab\u8350::\u62da\u71f1\ub70c\u7043\uc246\uf995, getfield:\uf9c5\u1187\ud4fe\uae87\u64ab\u8350(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u3dd3\ub18d\ucef1\u3e75\ud171\u6198, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Date \ud171\u7049\ud7e8\u7c6b\u74b1\u98a4() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Date(invokestatic:Date(\u3a62\u4daf\u759a\u36d3\u7873\u4179::\ufe34\u8308\u6bb9\u8753\u8d98\ud7e8, invokevirtual:long(\uf9c5\u1187\ud4fe\uae87\u64ab\u8350::\ub7dc\u4f52\uc9f6\u9af2\ua3b4\u3a62, getfield:\uf9c5\u1187\ud4fe\uae87\u64ab\u8350(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u3dd3\ub18d\ucef1\u3e75\ud171\u6198, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc))))
        }
        
        goto(Label_0006)
    }
    
    public double \u7ce1\ub7dc\u8c8a\u8258\uc3e3\u8cae() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:double(div:double(l2d:double(invokevirtual:long(\uf9c5\u1187\ud4fe\uae87\u64ab\u8350::\u5bc4\uc31c\uc2bd\u156b\u8df4\u4d85, getfield:\uf9c5\u1187\ud4fe\uae87\u64ab\u8350(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u3dd3\ub18d\ucef1\u3e75\ud171\u6198, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc))), l2d:double(invokevirtual:long(\uf9c5\u1187\ud4fe\uae87\u64ab\u8350::\u8350\u4c2b\u47c2\u36d3\u8640\u0a06, getfield:\uf9c5\u1187\ud4fe\uae87\u64ab\u8350(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u3dd3\ub18d\ucef1\u3e75\ud171\u6198, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc)))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u71f1\u600f\u7e3f\uf9c5\u2dcc\uff55() {
        var_1_61 : int
        var_3_6B : Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>
        var_1_79 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_1_61 = and:int(ldc:int(-1099957057), ldc:int(-34865729))
        var_3_6B = invokeinterface:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>::iterator, getfield:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u8c8a\ub1b9\u5654\ud217\ua61f\u6d99, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc))
        
        loop {
            if (cmpne:boolean(and:int(var_1_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_79 = and:int(var_1_61:int, ldc:int(-1880985106))
            }
            else {
                var_1_79 = and:int(var_1_61:int, ldc:int(2086531007))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_6B:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>)) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f::\u600f\u1833\uc2bd\u4d85\uc229\u1187, checkcast:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(\u12b2\u4e72\u8df4\u67e9\u67e9.\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f.class, invokeinterface:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>::next, var_3_6B:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>))))) {
                        var_1_61 = and:int(var_1_79:int, ldc:int(-1134559745))
                        loopcontinue()
                    }
                    
                    return:boolean(xor:int[expected:boolean](ldc:int(24644), ldc:int(24645)))
                }
            }
            
            if (cmpne:boolean(and:int(var_1_79:int, ldc:int(65536)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(11904), ldc:int(-11914)))
            }
            
            var_1_61 = and:int(var_1_79:int, ldc:int(973266013))
        }
    }
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04 \u0c95\u8640\u40a9\uc87f\u156b\u8cae() {
        var_3_63 : \u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f
        var_4_6D : Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>
        var_5_92 : \u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_63 = aconstnull:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f()
            var_4_6D = invokeinterface:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>::iterator, getfield:List<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>(\ua068\ud217\u71ae\u8d98\u9937\u76bc::\u8c8a\ub1b9\u5654\ud217\ua61f\u6d99, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_6D:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>)) {
                var_5_92 = checkcast:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(\u12b2\u4e72\u8df4\u67e9\u67e9.\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f.class, invokeinterface:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f(Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>::next, var_4_6D:Iterator<\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f>))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f::\u600f\u1833\uc2bd\u4d85\uc229\u1187, var_5_92:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f))) {
                    loopcontinue()
                }
                
                if (logicaland:boolean(cmpne:boolean(var_3_63:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f, aconstnull:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f()), cmpge:boolean(invokevirtual:double(\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f::\u7330\u16f6\ucfaf\u6435\u8753\u4cd9, var_5_92:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f), invokevirtual:double(\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f::\u7330\u16f6\ucfaf\u6435\u8753\u4cd9, var_3_63:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f)))) {
                    loopcontinue()
                }
                
                var_3_63 = var_5_92:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f
            }
            
            return:\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04(ternaryop:\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04(cmpne:boolean(var_3_63:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f, aconstnull:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f()), invokevirtual:\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04(\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f::\u7c6b\ub8be\u8d90\uf94d\u927d\u6c56, var_3_63:\u34df\u3bd6\ubcb0\u8c8a\u97e6\u965f), aconstnull:\u4d85\u7bad\ub18d\u6d99\uc9f6\u4c04()))
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u8bb0\u6d99\u3711\u8258\uf9c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_67D : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_672 = and:int(ldc:int(230842636), ldc:int(-272785336))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua068\ud217\u71ae\u8d98\u9937\u76bc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(715021673))
        }
        else {
            var_3_672 = and:int(var_3_672:int, ldc:int(266560154))
            var_5_8A = and:int(ldc:int(21672), ldc:int(-21673))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7003), ldc:int(6738)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_672:int, ldc:int(2112005355))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, and:int(ldc:int(20739), ldc:int(149)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(8207), ldc:int(16929)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_E2:int, ldc:int(1842947774))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(8488), ldc:int(8489)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1473448281))
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1227456794))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-461095871))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(914894328))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1615332193))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0856)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-221617349))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2092323224))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1498929235))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1304340489))
                        var_11_F3 = and:int(ldc:int(13744), ldc:int(-14259))
                        goto(Label_1528)
                    }
                    
                    Label_0575:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1346159803))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1379673784))
                        goto(Label_1400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2111956931))
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1378297949))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(92038139))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1285912271))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0856)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-997182777))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2058874489))
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-637341))
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1052154936))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(271451832))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-756011675))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-590499448))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0856:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1291358066))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1002795508))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1821467738))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = and:int(ldc:int(1169), ldc:int(18721))
                                goto(Label_1122)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1676621214))
                        goto(Label_1400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(92520276))
                            goto(Label_0856)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1646666603))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-972983841))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(770762830))
                        var_11_F3 = and:int(ldc:int(5556), ldc:int(-5557))
                    }
                    
                    Label_1122:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(738397885))
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0856)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(2115715525))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-86700126))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-57822804))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1400)
                            }
                        }
                    }
                    
                    Label_1238:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1408158529))
                        goto(Label_1539)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1681100706))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1122)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1102256037))
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0856)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1713233469))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1639321648))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1026002870))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2063303078))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-957782737))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                        goto(Label_1528)
                    }
                    
                    Label_1400:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1190696923))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(498654612))
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1741176850))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(1054111421))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1528:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1539:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1665648225))
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-616959957))
                        goto(Label_0856)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1479326574))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(313296667))
                        goto(Label_0419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-271827522))
                        var_17_67D = add:int(var_16_121:int, xor:int(ldc:int(16646), ldc:int(16647)))
                        looporswitchbreak()
                    }
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(-1533313448))
                
                if (cmple:boolean(var_5_8A = var_17_67D:int, sub:int(var_6_91:int, xor:int(ldc:int(17), ldc:int(16))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(468203135))
            goto(Label_0108)
        }
    }
}
