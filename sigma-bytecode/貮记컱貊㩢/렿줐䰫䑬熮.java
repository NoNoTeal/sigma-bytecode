public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\ub83f\uc910\u4c2b\u446c\u71ae {
    public void \ub83f\uc910\u4c2b\u446c\u71ae(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
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
            invokespecial:Object(Object::<init>, this:\ub83f\uc910\u4c2b\u446c\u71ae)
            putfield:Map<Integer, \u3d4b\ub18d\u624e\uc2e8\u0c95>(\ub83f\uc910\u4c2b\u446c\u71ae::\ucef1\u647c\u6cfe\u92ee\ud171\u72f1, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:HashMap[expected:Map<Integer, \u3d4b\ub18d\u624e\uc2e8\u0c95>](Maps::newHashMap))
            putfield:Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(\ub83f\uc910\u4c2b\u446c\u71ae::\ua3b4\u2dcc\u4c04\uc84e\u47c2\u3bd6, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:HashMap[expected:Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>](Maps::newHashMap))
            putfield:Set<UUID>(\ub83f\uc910\u4c2b\u446c\u71ae::\u4e72\u8709\u3c25\u51fa\u4d85\u6b0d, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:HashSet[expected:Set<UUID>](Sets::newHashSet))
            putfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae, initobject:\u61a4\u51b2\u7330\ubb2b\u3504(\u61a4\u51b2\u7330\ubb2b\u3504::<init>, getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\ud12e\u7049\uc84e\u9937\u8bb0\u0c95), getstatic:\u5db4\u6435\u8d90\u927d\u4c2b(\u5db4\u6435\u8d90\u927d\u4c2b::\u2dcc\u9af2\u8bb0\ud51e\u1833\u7c6b), getstatic:\ub1b9\ub32d\u3bd6\ud158\ua068\uc229(\ub1b9\ub32d\u3bd6\ud158\ua068\uc229::\ud523\u0800\ufcaf\uae87\u9af2\u8413)))
            putfield:Random(\ub83f\uc910\u4c2b\u446c\u71ae::\u3c25\u960f\u8bb0\u624e\ub32d\u4975, this:\ub83f\uc910\u4c2b\u446c\u71ae, initobject:Random(Random::<init>))
            putfield:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub83f\uc910\u4c2b\u446c\u71ae::\u1187\u836c\u8258\ubff1\u8aa5\uc4d2, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Optional<T>::empty))
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u62da\u92ee\u62da\u3dd3\u4bc8\u92ff, this:\ub83f\uc910\u4c2b\u446c\u71ae, p0:int)
            putfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae, p1:\ube23\uc238\u5140\u4cd9\u8aa5)
            putfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua61f\uc29a\u67d0\u6c52\ub7dc\ua3b4, this:\ub83f\uc910\u4c2b\u446c\u71ae, and:int[expected:boolean](ldc:int(1937), ldc:int(2081)))
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae, xor:int(ldc:int(512), ldc:int(812)))
            invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u47c2\u12b2\u8350\u67e9\u416d\u120d, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:float(0.0f))
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\ub113\u6d99\u7006\uc31c\u965f\ub70c, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u4975\u47c2\uc84e\u392e\u5140\ub19c, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, p1:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd])))
            putfield:\u527a\u5db4\u4179\u6435\uafe7(\ub83f\uc910\u4c2b\u446c\u71ae::\uff55\uc3e3\u9a18\u6b0d\u183a\u88c5, this:\ub83f\uc910\u4c2b\u446c\u71ae, getstatic:\u527a\u5db4\u4179\u6435\uafe7(\u527a\u5db4\u4179\u6435\uafe7::\ua61f\u6cfe\u5db4\u4d85\u8aa5\uf9c5))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub83f\uc910\u4c2b\u446c\u71ae(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1) {
        var_5_1E6 : \ud158\u8308\u76bc\u0a06\ud36e
        var_6_1EF : int
        
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
            invokespecial:Object(Object::<init>, this:\ub83f\uc910\u4c2b\u446c\u71ae)
            putfield:Map<Integer, \u3d4b\ub18d\u624e\uc2e8\u0c95>(\ub83f\uc910\u4c2b\u446c\u71ae::\ucef1\u647c\u6cfe\u92ee\ud171\u72f1, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:HashMap[expected:Map<Integer, \u3d4b\ub18d\u624e\uc2e8\u0c95>](Maps::newHashMap))
            putfield:Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(\ub83f\uc910\u4c2b\u446c\u71ae::\ua3b4\u2dcc\u4c04\uc84e\u47c2\u3bd6, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:HashMap[expected:Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>](Maps::newHashMap))
            putfield:Set<UUID>(\ub83f\uc910\u4c2b\u446c\u71ae::\u4e72\u8709\u3c25\u51fa\u4d85\u6b0d, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:HashSet[expected:Set<UUID>](Sets::newHashSet))
            putfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae, initobject:\u61a4\u51b2\u7330\ubb2b\u3504(\u61a4\u51b2\u7330\ubb2b\u3504::<init>, getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\ud12e\u7049\uc84e\u9937\u8bb0\u0c95), getstatic:\u5db4\u6435\u8d90\u927d\u4c2b(\u5db4\u6435\u8d90\u927d\u4c2b::\u2dcc\u9af2\u8bb0\ud51e\u1833\u7c6b), getstatic:\ub1b9\ub32d\u3bd6\ud158\ua068\uc229(\ub1b9\ub32d\u3bd6\ud158\ua068\uc229::\ud523\u0800\ufcaf\uae87\u9af2\u8413)))
            putfield:Random(\ub83f\uc910\u4c2b\u446c\u71ae::\u3c25\u960f\u8bb0\u624e\ub32d\u4975, this:\ub83f\uc910\u4c2b\u446c\u71ae, initobject:Random(Random::<init>))
            putfield:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub83f\uc910\u4c2b\u446c\u71ae::\u1187\u836c\u8258\ubff1\u8aa5\uc4d2, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Optional<T>::empty))
            putfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae, p0:\ube23\uc238\u5140\u4cd9\u8aa5)
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u62da\u92ee\u62da\u3dd3\u4bc8\u92ff, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(-24087), ldc:int(22038)))))
            putfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ub7dc\uae5d\ua3b4\uc246\uc910\u8753, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u3711\u6c52\ud4fe\u3d64\u76bc, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(6402), ldc:int(6403)))))
            putfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua61f\uc29a\u67d0\u6c52\ub7dc\ua3b4, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u3711\u6c52\ud4fe\u3d64\u76bc, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(4165), ldc:int(4167)))))
            putfield:long(\ub83f\uc910\u4c2b\u446c\u71ae::\u74b1\u4179\ua3b4\uc87f\u385b\u9255, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:long(\uc31c\uc87f\uc246\u3776\ub7dc::\ud217\ud4fe\ubded\uae87\u873d\u8df4, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(38), ldc:int(37)))))
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc84e\u8bb0\u7043\u61a4\u6d99\u3e2a, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(11684), ldc:int(20502)))))
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u6c56\u836c\u98a4\u34df\u40a9, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(8323), ldc:int(8326)))))
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(-15356), ldc:int(-15358)))))
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u71ae\u927d\uf995\u9937\u71f1\u7049, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(2071), ldc:int(8271)))))
            putfield:float(\ub83f\uc910\u4c2b\u446c\u71ae::\u960f\u7c6b\u4f4a\u3776\u3a62\ubefe, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:float(\uc31c\uc87f\uc246\u3776\ub7dc::\ub113\u98a4\uceb8\u3bd6\uc87f\ud51e, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(-30717), ldc:int(-30709)))))
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(27), ldc:int(2701)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(3659), ldc:int(4106)))), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(16427), ldc:int(2059))))))
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\ub113\u6d99\u7006\uc31c\u965f\ub70c, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::\u8aa5\u5db4\ud171\u69d9\uc246\ubcb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(5358), ldc:int(18444)))))
            putfield:\u527a\u5db4\u4179\u6435\uafe7(\ub83f\uc910\u4c2b\u446c\u71ae::\uff55\uc3e3\u9a18\u6b0d\u183a\u88c5, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:\u527a\u5db4\u4179\u6435\uafe7(\u527a\u5db4\u4179\u6435\uafe7::\u3504\u9937\u8413\ub113\ub113\u6fb0, invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::\ud36e\u51fa\ua562\ubf56\u51fa\u1187, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(2314), ldc:int(2311))))))
            invokeinterface:void(Set<E>::clear, getfield:Set<UUID>(\ub83f\uc910\u4c2b\u446c\u71ae::\u4e72\u8709\u3c25\u51fa\u4d85\u6b0d, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            
            if (invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::\u7873\ub32d\ub83f\u983f\u600f\u6fb0, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(22549), ldc:int(22555))), ldc:int(9))) {
                var_5_1E6 = invokevirtual:\ud158\u8308\u76bc\u0a06\ud36e(\uc31c\uc87f\uc246\u3776\ub7dc::\uff55\u40a9\u8753\u4975\u120d\u4daf, p1:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(610), ldc:int(620))), ldc:int(11))
                var_6_1EF = and:int(ldc:int(22152), ldc:int(-22153))
                
                while (cmplt:boolean(var_6_1EF:int, invokevirtual:int(\ud158\u8308\u76bc\u0a06\ud36e::size, var_5_1E6:\ud158\u8308\u76bc\u0a06\ud36e))) {
                    invokeinterface:boolean(Set<UUID>::add, getfield:Set<UUID>(\ub83f\uc910\u4c2b\u446c\u71ae::\u4e72\u8709\u3c25\u51fa\u4d85\u6b0d, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokestatic:UUID(\u946b\u92ee\u6fb0\ua6bd\ubefe::\u6b0d\ud12e\u47c2\ub102\u3bd6\uc238, invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\ud158\u8308\u76bc\u0a06\ud36e::get, var_5_1E6:\ud158\u8308\u76bc\u0a06\ud36e, var_6_1EF:int)))
                    inc:int(var_6_1EF, ldc:int(1))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4cd9\u3dd3\u8d98\u92ff\ubefe\ucef1() {
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
            return:boolean(ternaryop:int[expected:boolean](logicalor:boolean(invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua6bd\u51b2\u16f6\u67d0\u965f\ub102, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ud7e8\u3504\u92ee\u64f2\u6d99\u1833, this:\ub83f\uc910\u4c2b\u446c\u71ae)), xor:int(ldc:int(6164), ldc:int(6165)), and:int(ldc:int(-5461), ldc:int(5460))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u927d\u9255\u8413\uc246\uc246\ud4fe() {
        var_1_61 : int
        stack_A6_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1838502221), ldc:int(-170398030))
            
            if (invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ubcb0\u5bc4\u3a62\u40a9\u600f\u4f52, this:\ub83f\uc910\u4c2b\u446c\u71ae)) {
                if (cmpeq:boolean(invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc246\u927d\u416d\ubb2b\ua3b4\u93a2, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(0))) {
                    if (cmpgt:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(0))) {
                        stack_A6_0 = xor:int[expected:boolean](ldc:int(6664), ldc:int(6665))
                        return:boolean(stack_A6_0:boolean)
                    }
                }
            }
            
            var_1_61 = and:int(var_1_61:int, ldc:int(-1041266788))
            stack_A6_0 = and:int[expected:boolean](ldc:int(10032), ldc:int(-10036))
            return:boolean(stack_A6_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public boolean \ubcb0\u5bc4\u3a62\u40a9\u600f\u4f52() {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-56467616), ldc:int(1971752497))
            
            if (cmple:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u6c56\u836c\u98a4\u34df\u40a9, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2125176439))
                stack_8A_0 = and:int(ldc:int(18958), ldc:int(-27151))
            }
            else {
                stack_8A_0 = and:int(ldc:int(1545), ldc:int(2069))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7ce1\u4179\u93a2\ub6ab\u8308\u0800() {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1445595008), ldc:int(900229033))
            
            if (cmpne:boolean(getfield:\u527a\u5db4\u4179\u6435\uafe7(\ub83f\uc910\u4c2b\u446c\u71ae::\uff55\uc3e3\u9a18\u6b0d\u183a\u88c5, this:\ub83f\uc910\u4c2b\u446c\u71ae), getstatic:\u527a\u5db4\u4179\u6435\uafe7(\u527a\u5db4\u4179\u6435\uafe7::\u8bb0\u88c5\u392e\uc3e3\ud36e\u8640))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(765632468))
                stack_8D_0 = and:int(ldc:int(608), ldc:int(-609))
            }
            else {
                stack_8D_0 = and:int(ldc:int(10241), ldc:int(213))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \ua6bd\u51b2\u16f6\u67d0\u965f\ub102() {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(117532159), ldc:int(1160084709))
            
            if (cmpne:boolean(getfield:\u527a\u5db4\u4179\u6435\uafe7(\ub83f\uc910\u4c2b\u446c\u71ae::\uff55\uc3e3\u9a18\u6b0d\u183a\u88c5, this:\ub83f\uc910\u4c2b\u446c\u71ae), getstatic:\u527a\u5db4\u4179\u6435\uafe7(\u527a\u5db4\u4179\u6435\uafe7::\u64ab\u071d\u071d\u9255\u64ab\u88c5))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1708488631))
                stack_8D_0 = and:int(ldc:int(25544), ldc:int(-26569))
            }
            else {
                stack_8D_0 = xor:int(ldc:int(16392), ldc:int(16393))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud7e8\u3504\u92ee\u64f2\u6d99\u1833() {
        var_1_61 : int
        stack_8D_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-860107392), ldc:int(-287355492))
            
            if (cmpne:boolean(getfield:\u527a\u5db4\u4179\u6435\uafe7(\ub83f\uc910\u4c2b\u446c\u71ae::\uff55\uc3e3\u9a18\u6b0d\u183a\u88c5, this:\ub83f\uc910\u4c2b\u446c\u71ae), getstatic:\u527a\u5db4\u4179\u6435\uafe7(\u527a\u5db4\u4179\u6435\uafe7::\u71f1\ub171\u4492\u446c\ud171\ube23))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-419516454))
                stack_8D_0 = and:int(ldc:int(-8266), ldc:int(8265))
            }
            else {
                stack_8D_0 = and:int(ldc:int(1025), ldc:int(2505))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c \u0c95\u6d99\u51b2\u8258\ub70c\u516c() {
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
            return:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7049\ud158\u5140\u0c95\u7e3f\u946b() {
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
            return:boolean(getfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ub7dc\uae5d\ua3b4\uc246\uc910\u8753, this:\ub83f\uc910\u4c2b\u446c\u71ae))
        }
        
        goto(Label_0006)
    }
    
    public int \u6cfe\ub19c\uc229\u97b7\u120d\uc87f() {
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
            return:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u6c56\u836c\u98a4\u34df\u40a9, this:\ub83f\uc910\u4c2b\u446c\u71ae))
        }
        
        goto(Label_0006)
    }
    
    private java.util.function.Predicate<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> \uc9f6\u600f\u2dcc\uf995\u3bc9\ub18d() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private void \u5f50\u946b\u88c5\u9937\uc31c\u62da() {
        var_1_61 : int
        var_3_6C : HashSet
        var_4_78 : List<\u51fa\u6c52\u7330\u7330\u960f>
        var_5_81 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_1_90 : int
        var_6_ED : \u51fa\u6c52\u7330\u7330\u960f
        var_6_14F : \u51fa\u6c52\u7330\u7330\u960f
        
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
            var_1_61 = and:int(ldc:int(-1959274741), ldc:int(-407411001))
            var_3_6C = invokestatic:HashSet(Sets::newHashSet, invokevirtual:Collection<\u51fa\u6c52\u7330\u7330\u960f>[expected:Iterable](\u61a4\u51b2\u7330\ubb2b\u3504::\u56bd\u9a18\ub70c\u8709\u7049\u93a2, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            var_4_78 = invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokespecial:Predicate<\u51fa\u6c52\u7330\u7330\u960f>(\ub83f\uc910\u4c2b\u446c\u71ae::\uc9f6\u600f\u2dcc\uf995\u3bc9\ub18d, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            var_5_81 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, var_4_78:List<\u51fa\u6c52\u7330\u7330\u960f>)
            
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_90 = and:int(var_1_61:int, ldc:int(-1387366730))
                    goto(Label_0289)
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_90 = and:int(var_1_61:int, ldc:int(-1145876957))
                }
                else {
                    var_1_90 = and:int(var_1_61:int, ldc:int(-284174841))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_81:Iterator)) {
                        var_6_ED = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_5_81:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Set<E>::contains, var_3_6C:HashSet<\u51fa\u6c52\u7330\u7330\u960f>[expected:Set<\u51fa\u6c52\u7330\u7330\u960f>], var_6_ED:\u51fa\u6c52\u7330\u7330\u960f[expected:Object]))) {
                            invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u6b5f\u946b\u927d\u8753\u839e\u3d64, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), var_6_ED:\u51fa\u6c52\u7330\u7330\u960f)
                        }
                        
                        var_1_61 = and:int(var_1_90:int, ldc:int(-1417177589))
                        loopcontinue()
                    }
                }
                
                Label_0181:
                
                if (cmpne:boolean(and:int(var_1_90:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_90:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_61 = and:int(var_1_90:int, ldc:int(636590966))
                        loopcontinue()
                    }
                    
                    var_1_90 = and:int(var_1_90:int, ldc:int(-1677762653))
                    var_5_81 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(Set<\u51fa\u6c52\u7330\u7330\u960f>::iterator, var_3_6C:HashSet<\u51fa\u6c52\u7330\u7330\u960f>[expected:Set<\u51fa\u6c52\u7330\u7330\u960f>])
                    
                    while (invokeinterface:boolean(Iterator::hasNext, var_5_81:Iterator)) {
                        var_6_14F = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_5_81:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(List<E>::contains, var_4_78:List<\u51fa\u6c52\u7330\u7330\u960f>, var_6_14F:\u51fa\u6c52\u7330\u7330\u960f[expected:Object]))) {
                            invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\ud217\u071d\u0800\u7af6\u61a4\ub70c, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), var_6_14F:\u51fa\u6c52\u7330\u7330\u960f)
                        }
                        
                        var_1_90 = and:int(var_1_90:int, ldc:int(-1620052181))
                    }
                }
                
                Label_0289:
                
                if (cmpne:boolean(and:int(var_1_90:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0181)
                }
                
                if (cmpne:boolean(and:int(var_1_90:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_90:int, ldc:int(472076211))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u8350\u64f2\u156b\u0800\u4f52\u67d0() {
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
            return:int(xor:int(ldc:int(4612), ldc:int(4609)))
        }
        
        goto(Label_0006)
    }
    
    public int \u4d85\u3776\u4f4a\u3e75\u8d98\u873d() {
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
            return:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc84e\u8bb0\u7043\u61a4\u6d99\u3e2a, this:\ub83f\uc910\u4c2b\u446c\u71ae))
        }
        
        goto(Label_0006)
    }
    
    public void \ub171\u5f50\u183a\u5654\u8640\u7006(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0) {
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
            
            if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u8640\u59ec\ubff1\u9a18\u9255\ub70c, p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\ube23\u67d0\u64f2\u839e\u76bc], getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\u759a\u8c8a\u7c6b\u8709\u8753\u4cd9))) {
                putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc84e\u8bb0\u7043\u61a4\u6d99\u3e2a, this:\ub83f\uc910\u4c2b\u446c\u71ae, add:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc84e\u8bb0\u7043\u61a4\u6d99\u3e2a, this:\ub83f\uc910\u4c2b\u446c\u71ae), add:int(invokevirtual:int(\u516c\u3dd3\ub113\u6d69\u76bc::\ua61f\u392e\uc229\u97b7\ub70c\u3504, invokevirtual:\u516c\u3dd3\ub113\u6d69\u76bc(\ube23\u67d0\u64f2\u839e\u76bc::\u7ce1\u0800\ua562\u5654\ub113\ua562, p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\ube23\u67d0\u64f2\u839e\u76bc], getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\u759a\u8c8a\u7c6b\u8709\u8753\u4cd9))), xor:int(ldc:int(-16248), ldc:int(-16247)))))
                putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc84e\u8bb0\u7043\u61a4\u6d99\u3e2a, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc84e\u8bb0\u7043\u61a4\u6d99\u3e2a, this:\ub83f\uc910\u4c2b\u446c\u71ae), and:int(ldc:int(17019), ldc:int(-27260)), invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u8350\u64f2\u156b\u0800\u4f52\u67d0, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            }
            
            invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u40a9\u52d3\u16f6\u416d\u8640\uae87, p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\ube23\u67d0\u64f2\u839e\u76bc], getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\u759a\u8c8a\u7c6b\u8709\u8753\u4cd9))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8df4\u8308\u7049\u4975\u7049\u8c8a() {
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
            putfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua61f\uc29a\u67d0\u6c52\ub7dc\ua3b4, this:\ub83f\uc910\u4c2b\u446c\u71ae, and:int[expected:boolean](ldc:int(-16573), ldc:int(188)))
            invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\ub19c\u4c04\uc9f6\u3776\u0800\u3dd3, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            putfield:\u527a\u5db4\u4179\u6435\uafe7(\ub83f\uc910\u4c2b\u446c\u71ae::\uff55\uc3e3\u9a18\u6b0d\u183a\u88c5, this:\ub83f\uc910\u4c2b\u446c\u71ae, getstatic:\u527a\u5db4\u4179\u6435\uafe7(\u527a\u5db4\u4179\u6435\uafe7::\u8bb0\u88c5\u392e\uc3e3\ud36e\u8640))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua562\u61a4\ub102\ud523\u071d\u40a9() {
        var_1_E9 : int
        var_3_BF : boolean
        var_1_301 : int
        var_4_306 : int
        stack_8B3_0 : \u61a4\u51b2\u7330\ubb2b\u3504 [generated]
        stack_8AE_0 : IFormattableTextComponent [generated]
        stack_8AB_1 : String [generated]
        expr_89A : Object[] [generated]
        var_1_A3F : int
        var_5_376 : int
        var_6_37F : int
        var_1_479 : int
        stack_4F8_0 : int [generated]
        var_7_691 : int
        stack_A40_0 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 [generated]
        var_7_A40 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_7_B84 : Iterator<UUID>
        var_9_BCA : \u7d52\u718f\u3776\u6fb0\ub83f
        var_10_BF5 : \ube23\u67d0\u64f2\u839e\u76bc
        var_11_C3F : \u51fa\u6c52\u7330\u7330\u960f
        
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
        var_1_E9 = and:int(ldc:int(187091454), ldc:int(599673851))
        
        if (logicalnot:boolean(invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u7ce1\u4179\u93a2\ub6ab\u8308\u0800, this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
            if (cmpne:boolean(getfield:\u527a\u5db4\u4179\u6435\uafe7(\ub83f\uc910\u4c2b\u446c\u71ae::\uff55\uc3e3\u9a18\u6b0d\u183a\u88c5, this:\ub83f\uc910\u4c2b\u446c\u71ae), getstatic:\u527a\u5db4\u4179\u6435\uafe7(\u527a\u5db4\u4179\u6435\uafe7::\ua61f\u6cfe\u5db4\u4d85\u8aa5\uf9c5))) {
                goto(Label_0142)
            }
            
            var_3_BF = getfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua61f\uc29a\u67d0\u6c52\ub7dc\ua3b4, this:\ub83f\uc910\u4c2b\u446c\u71ae)
            putfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua61f\uc29a\u67d0\u6c52\ub7dc\ua3b4, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\u64ab\u6b5f\u7873\ubefe\u392e\u51b2, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            
            if (cmpeq:boolean(invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)), getstatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u97b7\u98a4\u385b\u5140\u0c95\uc4d2))) {
                invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u8df4\u8308\u7049\u4975\u7049\u8c8a, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                return:void()
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(-241480615))
                    goto(Label_0960)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0680)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(512)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(-687366245))
                    goto(Label_0596)
                }
                
                if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(2097152)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(-125045558))
                    goto(Label_0510)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(-1448991694))
                    goto(Label_0415)
                }
                
                if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(517704862))
                }
                else {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(-1635882224))
                    
                    if (cmpne:boolean(var_3_BF:boolean, getfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua61f\uc29a\u67d0\u6c52\ub7dc\ua3b4, this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                        invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u983f\u718f\u965f\u759a\u4ab3\u647c, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), getfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua61f\uc29a\u67d0\u6c52\ub7dc\ua3b4, this:\ub83f\uc910\u4c2b\u446c\u71ae))
                    }
                }
                
                Label_0327:
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(512)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(-131387597))
                    goto(Label_0960)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0680)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(512)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(1743437500))
                    goto(Label_0596)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0510)
                }
                
                if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(512)), ldc:int(0))) {
                        var_1_E9 = and:int(var_1_E9:int, ldc:int(-1461958407))
                        loopcontinue()
                    }
                    
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(-1758045755))
                    
                    if (logicalnot:boolean(getfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua61f\uc29a\u67d0\u6c52\ub7dc\ua3b4, this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                        return:void()
                    }
                }
                
                Label_0415:
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0960)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(512)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(1204595342))
                    goto(Label_0680)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(900114611))
                    goto(Label_0596)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(131072)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0327)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_E9 = and:int(var_1_E9:int, ldc:int(44547805))
                        loopcontinue()
                    }
                    
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(-1150354255))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\ub7dc\u873d\u6b0d\u4ab3\u6fb0, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae)))) {
                        invokespecial:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u6cfe\ud217\ud158\ufe34\u40a9\ub83f, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                    }
                }
                
                Label_0510:
                
                if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0960)
                }
                
                if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0680)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(67108864)), ldc:int(0))) {
                        var_1_E9 = and:int(var_1_E9:int, ldc:int(1717779310))
                        goto(Label_0415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_E9 = and:int(var_1_E9:int, ldc:int(-1953766275))
                        loopcontinue()
                    }
                    
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(591293942))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\ub7dc\u873d\u6b0d\u4ab3\u6fb0, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae)))) {
                        if (cmple:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u6c56\u836c\u98a4\u34df\u40a9, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(0))) {
                            goto(Label_0960)
                        }
                        
                        putfield:\u527a\u5db4\u4179\u6435\uafe7(\ub83f\uc910\u4c2b\u446c\u71ae::\uff55\uc3e3\u9a18\u6b0d\u183a\u88c5, this:\ub83f\uc910\u4c2b\u446c\u71ae, getstatic:\u527a\u5db4\u4179\u6435\uafe7(\u527a\u5db4\u4179\u6435\uafe7::\u71f1\ub171\u4492\u446c\ud171\ube23))
                    }
                }
                
                Label_0596:
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0960)
                }
                
                if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(262144)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(2021100374))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0510)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0327)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(1933541121))
                    putfield:long(\ub83f\uc910\u4c2b\u446c\u71ae::\u74b1\u4179\ua3b4\uc87f\u385b\u9255, this:\ub83f\uc910\u4c2b\u446c\u71ae, add:long(getfield:long(\ub83f\uc910\u4c2b\u446c\u71ae::\u74b1\u4179\ua3b4\uc87f\u385b\u9255, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:long(1L)))
                    
                    if (cmpge:boolean(getfield:long(\ub83f\uc910\u4c2b\u446c\u71ae::\u74b1\u4179\ua3b4\uc87f\u385b\u9255, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:long(48000L))) {
                        invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u8df4\u8308\u7049\u4975\u7049\u8c8a, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                        return:void()
                    }
                }
                
                Label_0680:
                
                if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(131072)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(-230533024))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_E9 = and:int(var_1_E9:int, ldc:int(-1924634474))
                        goto(Label_0596)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0510)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_E9 = and:int(var_1_E9:int, ldc:int(134612095))
                        goto(Label_0415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_E9 = and:int(var_1_E9:int, ldc:int(815387418))
                        loopcontinue()
                    }
                    
                    var_1_301 = and:int(var_1_E9:int, ldc:int(191822791))
                    var_4_306 = invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc246\u927d\u416d\ubb2b\ua3b4\u93a2, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                    
                    if (cmpeq:boolean(var_4_306:int, ldc:int(0))) {
                        if (invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\uc229\ubded\u3711\ubf56\ucb79\u51b2, this:\ub83f\uc910\u4c2b\u446c\u71ae)) {
                            if (cmpgt:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(0))) {
                                goto(Label_1081)
                            }
                            
                            if (cmpeq:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(0))) {
                                if (cmpgt:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u6c56\u836c\u98a4\u34df\u40a9, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(0))) {
                                    putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae, and:int(ldc:int(380), ldc:int(19372)))
                                    invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u3711\ud171\u74b1\u960f\u4e72\u7006, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\ud12e\u7049\uc84e\u9937\u8bb0\u0c95))
                                    return:void()
                                }
                            }
                        }
                    }
                    
                    Label_0781:
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_2070)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_301:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_301 = and:int(var_1_301:int, ldc:int(-1960680375))
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_301 = and:int(var_1_301:int, ldc:int(-1364238345))
                        
                        if (cmpeq:boolean(rem:long(getfield:long(\ub83f\uc910\u4c2b\u446c\u71ae::\u74b1\u4179\ua3b4\uc87f\u385b\u9255, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:long(20L)), ldc:long(0L))) {
                            invokespecial:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u5f50\u946b\u88c5\u9937\uc31c\u62da, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                            invokespecial:void(\ub83f\uc910\u4c2b\u446c\u71ae::\uc4d2\u0a06\u12cb\uc238\uc7fe\u1187, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                            
                            if (cmple:boolean(var_4_306:int, ldc:int(0))) {
                                goto(Label_1985)
                            }
                            
                            if (cmpgt:boolean(var_4_306:int, and:int(ldc:int(6538), ldc:int(17475)))) {
                                goto(Label_2070)
                            }
                            
                            stack_8B3_0 = getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                            stack_8AE_0 = invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(ITextComponent::deepCopy, getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\ud12e\u7049\uc84e\u9937\u8bb0\u0c95)), loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(141), ldc:int(130))))
                            stack_8AB_1 = loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(4133), ldc:int(4149)))
                            expr_89A = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(8460), ldc:int(8461)))
                            storeelement:Object(expr_89A:Object[], and:int(ldc:int(-25242), ldc:int(8857)), invokestatic:Integer[expected:Object](Integer::valueOf, var_4_306:int))
                            invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u3711\ud171\u74b1\u960f\u4e72\u7006, stack_8B3_0:\u61a4\u51b2\u7330\ubb2b\u3504, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, stack_8AE_0:IFormattableTextComponent, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8AB_1:String, expr_89A:Object[])))
                        }
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_2070)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_301:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1985)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_301:int, ldc:int(65536)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_301:int, ldc:int(-1208529308))
                            var_5_376 = and:int(ldc:int(-20304), ldc:int(17226))
                            var_6_37F = and:int(ldc:int(-15852), ldc:int(9643))
                            goto(Label_2237)
                        }
                        
                        goto(Label_0781)
                    }
                    
                    Label_1081:
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_301 = and:int(var_1_301:int, ldc:int(1165951469))
                        goto(Label_2070)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_301:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_301:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_301 = and:int(var_1_301:int, ldc:int(-10793006))
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_301 = and:int(var_1_301:int, ldc:int(-438222625))
                        goto(Label_0781)
                    }
                    
                    var_1_479 = and:int(var_1_301:int, ldc:int(-760316359))
                    var_5_376 = invokevirtual:boolean[expected:int](Optional<T>::isPresent, getfield:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub83f\uc910\u4c2b\u446c\u71ae::\u1187\u836c\u8258\ubff1\u8aa5\uc4d2, this:\ub83f\uc910\u4c2b\u446c\u71ae))
                    
                    if (logicaland:boolean(cmpeq:boolean(var_5_376:int, ldc:int(0)), cmpeq:boolean(rem:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae), and:int(ldc:int(4357), ldc:int(25685))), ldc:int(0)))) {
                        stack_4F8_0 = and:int(ldc:int(10241), ldc:int(257))
                    }
                    else {
                        var_1_479 = and:int(var_1_479:int, ldc:int(459766103))
                        stack_4F8_0 = and:int(ldc:int(-13624), ldc:int(12567))
                    }
                    
                    var_1_A3F = and:int(var_1_479:int, ldc:int(1379912019))
                    var_6_37F = stack_4F8_0:int
                    
                    if (cmpne:boolean(var_5_376:int, ldc:int(0))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u69d9\u759a\u64ab\ua3b4\u6b0d::\ufcaf\u67e9\u873d\u8709\ud51e\u97b7, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)), initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::get, getfield:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub83f\uc910\u4c2b\u446c\u71ae::\u1187\u836c\u8258\ubff1\u8aa5\uc4d2, this:\ub83f\uc910\u4c2b\u446c\u71ae))))))) {
                            var_6_37F = xor:int(ldc:int(2176), ldc:int(2177))
                        }
                    }
                    
                    Label_1279:
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1680878654))
                        goto(Label_2843)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(512)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1886926496))
                        goto(Label_2495)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_2367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_2244)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1964245032))
                        goto(Label_1806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-236925274))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1794846607))
                    }
                    else {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-769234335))
                        
                        if (cmpne:boolean(var_6_37F:int, ldc:int(0))) {
                            var_7_691 = and:int(ldc:int(-24702), ldc:int(24693))
                            
                            if (cmplt:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(100))) {
                                var_7_691 = xor:int(ldc:int(16385), ldc:int(16384))
                                goto(Label_1724)
                            }
                            
                            Label_1692:
                            
                            if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(8388608)), ldc:int(0))) {
                                var_1_A3F = and:int(var_1_A3F:int, ldc:int(-2123264622))
                            }
                            else {
                                var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1556100290))
                                
                                if (cmplt:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(40))) {
                                    var_7_691 = and:int(ldc:int(18455), ldc:int(578))
                                }
                            }
                            
                            Label_1724:
                            
                            if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(131072)), ldc:int(0))) {
                                var_1_A3F = and:int(var_1_A3F:int, ldc:int(1929031827))
                                goto(Label_1692)
                            }
                            
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(117434534))
                            putfield:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub83f\uc910\u4c2b\u446c\u71ae::\u1187\u836c\u8258\ubff1\u8aa5\uc4d2, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokespecial:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub83f\uc910\u4c2b\u446c\u71ae::\u7bad\u8258\u4492\uae5d\u88c5\u7d52, this:\ub83f\uc910\u4c2b\u446c\u71ae, var_7_691:int))
                        }
                    }
                    
                    Label_1391:
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(772449508))
                        goto(Label_2495)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(2145623886))
                        goto(Label_2367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_2244)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1806)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(524288)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1353109974))
                            goto(Label_1279)
                        }
                        
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(1933564530))
                        
                        if (cmpne:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae), xor:int(ldc:int(17339), ldc:int(17047)))) {
                            if (cmpne:boolean(rem:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(20)), ldc:int(0))) {
                                goto(Label_1806)
                            }
                        }
                    }
                    
                    Label_1494:
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2843)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1884077421))
                        goto(Label_2495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1643820636))
                        goto(Label_2367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-923405681))
                        goto(Label_2244)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(947386160))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(634837950))
                            goto(Label_1391)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(512)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(815517149))
                            goto(Label_1279)
                        }
                        
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(2003201166))
                        invokespecial:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u5f50\u946b\u88c5\u9937\uc31c\u62da, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                    }
                    
                    Label_1806:
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(693860882))
                        goto(Label_2843)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_2495)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-964923820))
                        goto(Label_2367)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_2244)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(524288)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(1454777099))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(577510525))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(623112378))
                        goto(Label_1279)
                    }
                    
                    var_1_301 = and:int(var_1_A3F:int, ldc:int(-826320164))
                    putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae, sub:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae), and:int(ldc:int(2753), ldc:int(21521))))
                    invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u47c2\u12b2\u8350\u67e9\u416d\u120d, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, div:float(i2f:float(sub:int(and:int(ldc:int(10749), ldc:int(300)), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae))), ldc:float(300.0f)), ldc:float(0.0f), ldc:float(1.0f)))
                    goto(Label_0781)
                    Label_1985:
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_301 = and:int(var_1_301:int, ldc:int(-2008867926))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_301:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1081)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_301:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_301:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_301 = and:int(var_1_301:int, ldc:int(46119082))
                            goto(Label_0781)
                        }
                        
                        var_1_301 = and:int(var_1_301:int, ldc:int(1659295822))
                        invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u3711\ud171\u74b1\u960f\u4e72\u7006, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\ud12e\u7049\uc84e\u9937\u8bb0\u0c95))
                        goto(Label_0841)
                    }
                    
                    Label_2070:
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_301 = and:int(var_1_301:int, ldc:int(-1720794206))
                        goto(Label_1985)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(512)), ldc:int(0))) {
                        var_1_301 = and:int(var_1_301:int, ldc:int(-911786589))
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_301:int, ldc:int(536870912)), ldc:int(0))) {
                        var_1_301 = and:int(var_1_301:int, ldc:int(1229172574))
                        goto(Label_0781)
                    }
                    
                    var_1_301 = and:int(var_1_301:int, ldc:int(-1641625581))
                    invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u3711\ud171\u74b1\u960f\u4e72\u7006, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\ud12e\u7049\uc84e\u9937\u8bb0\u0c95))
                    goto(Label_0841)
                    Label_2237:
                    
                    if (invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u0800\u5fe1\u9255\u93a2\u7043\u99f7, this:\ub83f\uc910\u4c2b\u446c\u71ae)) {
                        if (logicalnot:boolean(invokevirtual:boolean(Optional<T>::isPresent, getfield:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub83f\uc910\u4c2b\u446c\u71ae::\u1187\u836c\u8258\ubff1\u8aa5\uc4d2, this:\ub83f\uc910\u4c2b\u446c\u71ae)))) {
                            goto(Label_2495)
                        }
                        
                        stack_A40_0 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::get, getfield:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub83f\uc910\u4c2b\u446c\u71ae::\u1187\u836c\u8258\ubff1\u8aa5\uc4d2, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
                        goto(Label_2618)
                    }
                    
                    Label_2244:
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_2843)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(512)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(1781459425))
                        goto(Label_2495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(16384)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-990792073))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(-165669517))
                            goto(Label_1806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(262144)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(489923068))
                            goto(Label_1494)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(131072)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(2119881901))
                            goto(Label_1391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(733155723))
                            goto(Label_1279)
                        }
                        
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(1518300505))
                        
                        if (invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u7049\ud158\u5140\u0c95\u7e3f\u946b, this:\ub83f\uc910\u4c2b\u446c\u71ae)) {
                            if (logicalnot:boolean(invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\uc229\ubded\u3711\ubf56\ucb79\u51b2, this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                                if (cmpeq:boolean(var_4_306:int, ldc:int(0))) {
                                    if (cmpge:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u71ae\u927d\uf995\u9937\u71f1\u7049, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(40))) {
                                        goto(Label_2843)
                                    }
                                    
                                    putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u71ae\u927d\uf995\u9937\u71f1\u7049, this:\ub83f\uc910\u4c2b\u446c\u71ae, add:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u71ae\u927d\uf995\u9937\u71f1\u7049, this:\ub83f\uc910\u4c2b\u446c\u71ae), xor:int(ldc:int(1028), ldc:int(1029))))
                                }
                            }
                        }
                    }
                    
                    Label_2367:
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_2843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1631508006))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(2128721026))
                            goto(Label_2244)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1806)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1813934599))
                            goto(Label_1494)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(131072)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(-813906991))
                            goto(Label_1391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(131072)), ldc:int(0))) {
                            var_1_A3F = and:int(var_1_A3F:int, ldc:int(-2122510661))
                            goto(Label_1279)
                        }
                        
                        var_1_E9 = and:int(var_1_A3F:int, ldc:int(-156808395))
                        invokespecial:void(\ub83f\uc910\u4c2b\u446c\u71ae::\uc87f\u6b0d\u183a\uc238\u416d\u3e75, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                        looporswitchbreak()
                    }
                    
                    Label_2495:
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_2843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_2367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1920361432))
                        goto(Label_2244)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1670216329))
                        goto(Label_1806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1651093616))
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(1290803103))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    var_1_A3F = and:int(var_1_A3F:int, ldc:int(586042907))
                    stack_A40_0 = invokespecial:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc910\u4c2b\u446c\u71ae::\u3d64\u156b\ud12e\ud12e\u5654\ubf56, this:\ub83f\uc910\u4c2b\u446c\u71ae, var_6_37F:int, ldc:int(20))
                    Label_2618:
                    var_1_A3F = and:int(var_1_A3F:int, ldc:int(725581619))
                    var_7_A40 = stack_A40_0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
                    
                    if (cmpne:boolean(var_7_A40:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                        putfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ub7dc\uae5d\ua3b4\uc246\uc910\u8753, this:\ub83f\uc910\u4c2b\u446c\u71ae, and:int[expected:boolean](ldc:int(9533), ldc:int(20609)))
                        invokespecial:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u120d\ub1b9\uff55\u4c2b\u8709\ub6ab, this:\ub83f\uc910\u4c2b\u446c\u71ae, var_7_A40:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        
                        if (cmpne:boolean(var_5_376:int, ldc:int(0))) {
                            goto(Label_2703)
                        }
                        
                        invokespecial:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u3d4b\uf94d\u64f2\u98a4\u97b7\u93a2, this:\ub83f\uc910\u4c2b\u446c\u71ae, var_7_A40:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        var_5_376 = and:int(ldc:int(257), ldc:int(3595))
                        goto(Label_2703)
                    }
                    
                    Label_2631:
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(512)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1416724887))
                        goto(Label_2737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1039183711))
                    }
                    else {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-2039494276))
                        inc:int(var_6_37F, ldc:int(1))
                    }
                    
                    Label_2703:
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_2631)
                        }
                        
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(980842778))
                        
                        if (cmpgt:boolean(var_6_37F:int, xor:int(ldc:int(-31198), ldc:int(-31199)))) {
                            invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u8df4\u8308\u7049\u4975\u7049\u8c8a, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                            goto(Label_2244)
                        }
                    }
                    
                    Label_2737:
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_2703)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(65536)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(470650954))
                        goto(Label_2631)
                    }
                    
                    var_1_A3F = and:int(var_1_A3F:int, ldc:int(1655655059))
                    goto(Label_2237)
                    Label_2843:
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1869688776))
                        goto(Label_2495)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_2367)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1977484806))
                        goto(Label_1806)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_A3F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_A3F:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1097925142))
                        goto(Label_1279)
                    }
                    
                    var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1946198855))
                    putfield:\u527a\u5db4\u4179\u6435\uafe7(\ub83f\uc910\u4c2b\u446c\u71ae::\uff55\uc3e3\u9a18\u6b0d\u183a\u88c5, this:\ub83f\uc910\u4c2b\u446c\u71ae, getstatic:\u527a\u5db4\u4179\u6435\uafe7(\u527a\u5db4\u4179\u6435\uafe7::\u64ab\u071d\u071d\u9255\u64ab\u88c5))
                    var_7_B84 = invokeinterface:Iterator<UUID>(Set<UUID>::iterator, getfield:Set<UUID>(\ub83f\uc910\u4c2b\u446c\u71ae::\u4e72\u8709\u3c25\u51fa\u4d85\u6b0d, this:\ub83f\uc910\u4c2b\u446c\u71ae))
                    
                    while (invokeinterface:boolean(Iterator::hasNext, var_7_B84:Iterator)) {
                        var_9_BCA = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uc238\u5140\u4cd9\u8aa5::\u3d64\u4daf\ud36e\u8d98\u927d\u6ec6, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), checkcast:UUID(java.util.UUID.class, invokeinterface:UUID(Iterator<UUID>::next, var_7_B84:Iterator<UUID>)))
                        
                        if (instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_9_BCA:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                            if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, var_9_BCA:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                                var_10_BF5 = checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_9_BCA:\ube23\u67d0\u64f2\u839e\u76bc)
                                invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u16f6\u72f1\u7043\u76bc\u839e\u12b2, var_10_BF5:\ube23\u67d0\u64f2\u839e\u76bc, initobject:\u516c\u3dd3\ub113\u6d69\u76bc(\u516c\u3dd3\ub113\u6d69\u76bc::<init>, getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\u983f\u494c\u5fe1\ub19c\ud12e\u600f), ldc:int(48000), sub:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc84e\u8bb0\u7043\u61a4\u6d99\u3e2a, this:\ub83f\uc910\u4c2b\u446c\u71ae), xor:int(ldc:int(28688), ldc:int(28689))), and:int[expected:boolean](ldc:int(3702), ldc:int(-11904)), and:int[expected:boolean](ldc:int(14386), ldc:int(-14388)), xor:int[expected:boolean](ldc:int(-24566), ldc:int(-24565))))
                                
                                if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_10_BF5:\ube23\u67d0\u64f2\u839e\u76bc)) {
                                    var_11_C3F = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_10_BF5:\u51fa\u6c52\u7330\u7330\u960f)
                                    invokevirtual:void(\ua3b4\u8aa5\ub113\ubf56\u873d::\uc3e3\u8cae\u4492\u92ee\ub70c\ub7dc, var_11_C3F:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d], getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\u7873\u3504\uc2e8\u392e\ub1b9\u5f50))
                                    invokevirtual:void(\u3504\ufcaf\u71f1\u6bb9\u9033\ucfaf::\ucfaf\u4ab3\u6c52\u5d20\u7006\u183a, getstatic:\u3504\ufcaf\u71f1\u6bb9\u9033\ucfaf(\u51b2\u3dd3\u5db4\ub6ab\u7043\u62da::\u71f1\u8413\u56bd\u183a\u4e72\u92ee), var_11_C3F:\u51fa\u6c52\u7330\u7330\u960f)
                                }
                            }
                        }
                        
                        var_1_A3F = and:int(var_1_A3F:int, ldc:int(-1694545567))
                    }
                    
                    goto(Label_2367)
                }
                
                Label_0960:
                
                if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0680)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0596)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0510)
                }
                
                if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0415)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(2072730161))
                    goto(Label_0327)
                }
                
                if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_1_E9 = and:int(var_1_E9:int, ldc:int(1676634168))
                    invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u8df4\u8308\u7049\u4975\u7049\u8c8a, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                    goto(Label_0596)
                }
            }
        }
        
        Label_0105:
        
        if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_3190)
        }
        
        if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        Label_0142:
        
        if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_1_E9:int, ldc:int(262144)), ldc:int(0))) {
                var_1_E9 = and:int(var_1_E9:int, ldc:int(2066592112))
                goto(Label_0105)
            }
            
            var_1_E9 = and:int(var_1_E9:int, ldc:int(-1430849302))
            
            if (logicalnot:boolean(invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u4cd9\u3dd3\u8d98\u92ff\ubefe\ucef1, this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                goto(Label_0105)
            }
            
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u965f\u88c5\u67e9\u67e9\u873d, this:\ub83f\uc910\u4c2b\u446c\u71ae, add:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u965f\u88c5\u67e9\u67e9\u873d, this:\ub83f\uc910\u4c2b\u446c\u71ae), and:int(ldc:int(4869), ldc:int(16539))))
            
            if (cmpge:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u965f\u88c5\u67e9\u67e9\u873d, this:\ub83f\uc910\u4c2b\u446c\u71ae), xor:int(ldc:int(4510), ldc:int(5062)))) {
                invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u8df4\u8308\u7049\u4975\u7049\u8c8a, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                return:void()
            }
        }
        
        Label_3190:
        
        if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(536870912)), ldc:int(0))) {
            var_1_E9 = and:int(var_1_E9:int, ldc:int(-1034565826))
            goto(Label_0142)
        }
        
        if (cmpne:boolean(and:int(var_1_E9:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0105)
        }
        
        var_1_E9 = and:int(var_1_E9:int, ldc:int(1731198364))
        
        if (cmpne:boolean(rem:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u965f\u88c5\u67e9\u67e9\u873d, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(20)), ldc:int(0))) {
            goto(Label_0105)
        }
        
        invokespecial:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u5f50\u946b\u88c5\u9937\uc31c\u62da, this:\ub83f\uc910\u4c2b\u446c\u71ae)
        invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u983f\u718f\u965f\u759a\u4ab3\u647c, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), xor:int[expected:boolean](ldc:int(1280), ldc:int(1281)))
        
        if (logicalnot:boolean(invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua6bd\u51b2\u16f6\u67d0\u965f\ub102, this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
            var_1_E9 = and:int(var_1_E9:int, ldc:int(2074594363))
            invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u3711\ud171\u74b1\u960f\u4e72\u7006, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\u983f\u7e3f\u960f\u8709\ub70c\u600f))
            goto(Label_0105)
        }
        
        invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u47c2\u12b2\u8350\u67e9\u416d\u120d, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:float(0.0f))
        invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u3711\ud171\u74b1\u960f\u4e72\u7006, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\u4e72\uc2e8\uc31c\u8640\u7bad\u7330))
        goto(Label_0105)
    }
    
    private void \u6cfe\ud217\ud158\ufe34\u40a9\ub83f() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private java.util.Optional<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> \u7bad\u8258\u4492\uae5d\u88c5\u7d52(int p0) {
        var_2_61 : int
        var_4_69 : int
        var_2_78 : int
        var_5_B9 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_2_61 = and:int(ldc:int(-496864937), ldc:int(-297935674))
        var_4_69 = and:int(ldc:int(2917), ldc:int(-11110))
        
        loop {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_78 = and:int(var_2_61:int, ldc:int(-1989153245))
            }
            else {
                var_2_78 = and:int(var_2_61:int, ldc:int(1846575447))
                
                if (cmplt:boolean(var_4_69:int, and:int(ldc:int(14339), ldc:int(1827)))) {
                    var_5_B9 = invokespecial:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc910\u4c2b\u446c\u71ae::\u3d64\u156b\ud12e\ud12e\u5654\ubf56, this:\ub83f\uc910\u4c2b\u446c\u71ae, p0:int, xor:int(ldc:int(16448), ldc:int(16449)))
                    
                    if (cmpeq:boolean(var_5_B9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                        var_2_61 = and:int(var_2_78:int, ldc:int(592398591))
                        inc:int(var_4_69, ldc:int(1))
                        loopcontinue()
                    }
                    
                    return:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(invokestatic:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Optional<T>::of, var_5_B9:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_78:int, ldc:int(2147483647)), ldc:int(0))) {
                return:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(invokestatic:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Optional<T>::empty))
            }
            
            var_2_61 = and:int(var_2_78:int, ldc:int(-1452883010))
        }
    }
    
    private boolean \uc229\ubded\u3711\ubf56\ucb79\u51b2() {
        var_1_F3 : int
        stack_10F_0 : int [generated]
        var_1_BF : int
        stack_121_0 : int [generated]
        
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
            var_1_F3 = and:int(ldc:int(-260522338), ldc:int(-1235733537))
            
            if (invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u647c\u67d0\u8709\u9937\u12cb\u16f6, this:\ub83f\uc910\u4c2b\u446c\u71ae)) {
                if (invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u52d3\uc2bd\ub1b9\u6d69\u2dcc\u8258, this:\ub83f\uc910\u4c2b\u446c\u71ae)) {
                    goto(Label_0213)
                }
                
                stack_10F_0 = and:int[expected:boolean](ldc:int(21069), ldc:int(2179))
                return:boolean(stack_10F_0:boolean)
            }
            
            Label_0105:
            
            if (cmpne:boolean(and:int(var_1_F3:int, ldc:int(67108864)), ldc:int(0))) {
                var_1_F3 = and:int(var_1_F3:int, ldc:int(1497662979))
                goto(Label_0213)
            }
            
            if (cmpne:boolean(and:int(var_1_F3:int, ldc:int(262144)), ldc:int(0))) {
                var_1_BF = and:int(var_1_F3:int, ldc:int(1732772496))
            }
            else {
                var_1_BF = and:int(var_1_F3:int, ldc:int(-87579922))
                
                if (logicalnot:boolean(invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u8bb0\u16f6\uc2bd\u8308\u36d3\u873d, this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                    stack_121_0 = xor:int[expected:boolean](ldc:int(17025), ldc:int(17024))
                    return:boolean(stack_121_0:boolean)
                }
            }
            
            Label_0152:
            
            if (cmpeq:boolean(and:int(var_1_BF:int, ldc:int(268435456)), ldc:int(0))) {
                var_1_F3 = and:int(var_1_BF:int, ldc:int(235814085))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_BF:int, ldc:int(4)), ldc:int(0))) {
                    var_1_F3 = and:int(var_1_BF:int, ldc:int(938396248))
                    goto(Label_0105)
                }
                
                var_1_BF = and:int(var_1_BF:int, ldc:int(-1160118562))
                stack_121_0 = and:int[expected:boolean](ldc:int(-29879), ldc:int(9382))
                return:boolean(stack_121_0:boolean[expected:int])
            }
            
            Label_0213:
            
            if (cmpeq:boolean(and:int(var_1_F3:int, ldc:int(4194304)), ldc:int(0))) {
                var_1_BF = and:int(var_1_F3:int, ldc:int(-848608966))
                goto(Label_0152)
            }
            
            if (cmpeq:boolean(and:int(var_1_F3:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_1_F3 = and:int(var_1_F3:int, ldc:int(-1135858770))
            stack_10F_0 = and:int[expected:boolean](ldc:int(-30313), ldc:int(29800))
            return:boolean(stack_10F_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private boolean \u8bb0\u16f6\uc2bd\u8308\u36d3\u873d() {
        var_1_61 : int
        stack_8E_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(575761317), ldc:int(-609097755))
            
            if (cmpne:boolean(invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6cfe\ub19c\uc229\u97b7\u120d\uc87f, this:\ub83f\uc910\u4c2b\u446c\u71ae), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\ub113\u6d99\u7006\uc31c\u965f\ub70c, this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(595018681))
                stack_8E_0 = and:int(ldc:int(1037), ldc:int(-1038))
            }
            else {
                stack_8E_0 = and:int(ldc:int(11159), ldc:int(4161))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u647c\u67d0\u8709\u9937\u12cb\u16f6() {
        var_1_61 : int
        stack_91_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-74177589), ldc:int(-1483341937))
            
            if (cmple:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc84e\u8bb0\u7043\u61a4\u6d99\u3e2a, this:\ub83f\uc910\u4c2b\u446c\u71ae), and:int(ldc:int(10273), ldc:int(18077)))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-2046820613))
                stack_91_0 = and:int(ldc:int(9584), ldc:int(-9594))
            }
            else {
                stack_91_0 = and:int(ldc:int(4101), ldc:int(16457))
            }
            
            return:boolean(stack_91_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u52d3\uc2bd\ub1b9\u6d69\u2dcc\u8258() {
        var_1_61 : int
        stack_8E_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(125552180), ldc:int(664250062))
            
            if (cmple:boolean(invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6cfe\ub19c\uc229\u97b7\u120d\uc87f, this:\ub83f\uc910\u4c2b\u446c\u71ae), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\ub113\u6d99\u7006\uc31c\u965f\ub70c, this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1231608153))
                stack_8E_0 = and:int(ldc:int(-21673), ldc:int(20648))
            }
            else {
                stack_8E_0 = xor:int(ldc:int(24581), ldc:int(24580))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u516c\u836c\u1833\u6d69\u8753\u624e() {
        var_1_61 : int
        stack_A6_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(1401894888), ldc:int(-4524062))
            
            if (invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u8bb0\u16f6\uc2bd\u8308\u36d3\u873d, this:\ub83f\uc910\u4c2b\u446c\u71ae)) {
                if (cmpeq:boolean(invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc246\u927d\u416d\ubb2b\ua3b4\u93a2, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(0))) {
                    if (invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u647c\u67d0\u8709\u9937\u12cb\u16f6, this:\ub83f\uc910\u4c2b\u446c\u71ae)) {
                        stack_A6_0 = xor:int[expected:boolean](ldc:int(354), ldc:int(355))
                        return:boolean(stack_A6_0:boolean)
                    }
                }
            }
            
            var_1_61 = and:int(var_1_61:int, ldc:int(2029925871))
            stack_A6_0 = and:int[expected:boolean](ldc:int(20588), ldc:int(-31102))
            return:boolean(stack_A6_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private void \uc4d2\u0a06\u12cb\uc238\uc7fe\u1187() {
        var_1_61 : int
        var_3_70 : Iterator<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>
        var_4_74 : HashSet
        var_1_FF : int
        var_6_CF : Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>
        var_1_138 : int
        var_7_11A : \u3d4b\ub18d\u624e\uc2e8\u0c95
        var_8_121 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_5_B4 : Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>
        
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
            var_1_61 = and:int(ldc:int(-989188217), ldc:int(1100983546))
            var_3_70 = invokeinterface:Iterator<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(Collection<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>::iterator, invokeinterface:Collection<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>::values, getfield:Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(\ub83f\uc910\u4c2b\u446c\u71ae::\ua3b4\u2dcc\u4c04\uc84e\u47c2\u3bd6, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            var_4_74 = invokestatic:HashSet(Sets::newHashSet)
            
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_FF = and:int(var_1_61:int, ldc:int(1819382753))
                }
                else {
                    var_1_FF = and:int(var_1_61:int, ldc:int(-1008050201))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_70:Iterator<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>)) {
                        var_6_CF = invokeinterface:Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>(Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>::iterator, checkcast:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>(java.util.Set<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95>.class, invokeinterface:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>(Iterator<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>::next, var_3_70:Iterator<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>)))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_FF:int, ldc:int(16777216)), ldc:int(0))) {
                                var_1_138 = and:int(var_1_FF:int, ldc:int(-1189468432))
                            }
                            else {
                                var_1_138 = and:int(var_1_FF:int, ldc:int(128569006))
                                
                                if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_CF:Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>)) {
                                    var_7_11A = checkcast:\u3d4b\ub18d\u624e\uc2e8\u0c95(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95.class, invokeinterface:\u3d4b\ub18d\u624e\uc2e8\u0c95(Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>::next, var_6_CF:Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>))
                                    var_8_121 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                                    
                                    if (logicalnot:boolean(getfield:boolean(\u3d4b\ub18d\u624e\uc2e8\u0c95::\ua6bd\u3a62\ua61f\u12b2\u3e2a\ub19c, var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95))) {
                                        if (cmpeq:boolean(invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u3d4b\ub18d\u624e\uc2e8\u0c95::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95)), invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)))) {
                                            if (cmplt:boolean(invokevirtual:double(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8d98\u64f2\u97b7\ua6bd\uc229\u51fa, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae), var_8_121:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:double(12544.0))) {
                                                if (cmple:boolean(getfield:int(\u3d4b\ub18d\u624e\uc2e8\u0c95::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95), xor:int(ldc:int(119), ldc:int(559)))) {
                                                    goto(Label_0436)
                                                }
                                                
                                                if (cmpne:boolean(invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uc238\u5140\u4cd9\u8aa5::\u3d64\u4daf\ud36e\u8d98\u927d\u6ec6, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                                                    goto(Label_0497)
                                                }
                                                
                                                invokeinterface:boolean(Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>::add, var_4_74:HashSet<\u3d4b\ub18d\u624e\uc2e8\u0c95>[expected:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>], var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95)
                                                goto(Label_0497)
                                            }
                                        }
                                    }
                                    
                                    Label_0299:
                                    
                                    if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(16777216)), ldc:int(0))) {
                                        var_1_138 = and:int(var_1_138:int, ldc:int(-1940601534))
                                        goto(Label_0557)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_138:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_138 = and:int(var_1_138:int, ldc:int(1568938048))
                                        goto(Label_0497)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_138:int, ldc:int(65536)), ldc:int(0))) {
                                        var_1_138 = and:int(var_1_138:int, ldc:int(-659136968))
                                    }
                                    else {
                                        var_1_138 = and:int(var_1_138:int, ldc:int(-778048842))
                                        invokeinterface:boolean(Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>::add, var_4_74:HashSet<\u3d4b\ub18d\u624e\uc2e8\u0c95>[expected:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>], var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95)
                                    }
                                    
                                    Label_0436:
                                    
                                    if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_0557)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_138:int, ldc:int(1048576)), ldc:int(0))) {
                                        var_1_138 = and:int(var_1_138:int, ldc:int(1351317777))
                                    }
                                    else {
                                        if (cmpne:boolean(and:int(var_1_138:int, ldc:int(16777216)), ldc:int(0))) {
                                            var_1_FF = and:int(var_1_138:int, ldc:int(629828039))
                                            loopcontinue()
                                        }
                                        
                                        goto(Label_0299)
                                    }
                                    
                                    Label_0497:
                                    
                                    if (cmpne:boolean(and:int(var_1_138:int, ldc:int(524288)), ldc:int(0))) {
                                        if (cmpne:boolean(and:int(var_1_138:int, ldc:int(8388608)), ldc:int(0))) {
                                            var_1_138 = and:int(var_1_138:int, ldc:int(-1392772706))
                                            goto(Label_0436)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(128)), ldc:int(0))) {
                                            var_1_138 = and:int(var_1_138:int, ldc:int(1412330761))
                                            goto(Label_0299)
                                        }
                                        
                                        var_1_138 = and:int(var_1_138:int, ldc:int(1403910606))
                                        
                                        if (logicalnot:boolean(invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\ub7dc\u873d\u6b0d\u4ab3\u6fb0, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), var_8_121:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                                            if (cmpgt:boolean(invokevirtual:int(\ube23\u67d0\u64f2\u839e\u76bc::\ubb2b\ub83f\u93a2\u5d20\ud217\u385b, var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\ube23\u67d0\u64f2\u839e\u76bc]), and:int(ldc:int(3561), ldc:int(31602)))) {
                                                invokevirtual:void(\u3d4b\ub18d\u624e\uc2e8\u0c95::\ua3b4\u839e\uc9f6\uc29a\u4cd9\ud523, var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95, add:int(invokevirtual:int(\u3d4b\ub18d\u624e\uc2e8\u0c95::\u6bb9\u8aa5\u600f\u4daf\u67e9\ub83f, var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95), xor:int(ldc:int(12608), ldc:int(12609))))
                                            }
                                        }
                                    }
                                    
                                    Label_0557:
                                    
                                    if (cmpeq:boolean(and:int(var_1_138:int, ldc:int(2)), ldc:int(0))) {
                                        var_1_138 = and:int(var_1_138:int, ldc:int(1196197777))
                                        goto(Label_0497)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_138:int, ldc:int(134217728)), ldc:int(0))) {
                                        var_1_138 = and:int(var_1_138:int, ldc:int(-949126116))
                                        goto(Label_0436)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_1_138:int, ldc:int(8388608)), ldc:int(0))) {
                                        var_1_138 = and:int(var_1_138:int, ldc:int(1398209481))
                                        goto(Label_0299)
                                    }
                                    
                                    var_1_138 = and:int(var_1_138:int, ldc:int(-441770350))
                                    
                                    if (cmplt:boolean(invokevirtual:int(\u3d4b\ub18d\u624e\uc2e8\u0c95::\u6bb9\u8aa5\u600f\u4daf\u67e9\ub83f, var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95), ldc:int(30))) {
                                        goto(Label_0436)
                                    }
                                    
                                    invokeinterface:boolean(Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>::add, var_4_74:HashSet<\u3d4b\ub18d\u624e\uc2e8\u0c95>[expected:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>], var_7_11A:\u3d4b\ub18d\u624e\uc2e8\u0c95)
                                    goto(Label_0436)
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_138:int, ldc:int(2048)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_1_FF = and:int(var_1_138:int, ldc:int(-2075699182))
                        }
                        
                        var_1_61 = and:int(var_1_138:int, ldc:int(-2085057049))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_FF:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_FF:int, ldc:int(-1802379140))
            }
            
            var_5_B4 = invokeinterface:Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>(Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>::iterator, var_4_74:HashSet<\u3d4b\ub18d\u624e\uc2e8\u0c95>[expected:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>])
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_5_B4:Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>)) {
                invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u156b\uf995\u3e75\u5245\u8640\u873d, this:\ub83f\uc910\u4c2b\u446c\u71ae, checkcast:\u3d4b\ub18d\u624e\uc2e8\u0c95(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95.class, invokeinterface:\u3d4b\ub18d\u624e\uc2e8\u0c95(Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>::next, var_5_B4:Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>)), xor:int[expected:boolean](ldc:int(2818), ldc:int(2819)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3d4b\uf94d\u64f2\u98a4\u97b7\u93a2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_147 : int
        var_6_72 : Collection<\u51fa\u6c52\u7330\u7330\u960f>
        var_7_80 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_8_C0 : \u51fa\u6c52\u7330\u7330\u960f
        var_9_C7 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_10_CD : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_11_101 : float
        var_12_11C : double
        var_14_137 : double
        
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
            var_2_147 = and:int(ldc:int(681170412), ldc:int(615368931))
            var_6_72 = invokevirtual:Collection<\u51fa\u6c52\u7330\u7330\u960f>(\u61a4\u51b2\u7330\ubb2b\u3504::\u56bd\u9a18\ub70c\u8709\u7049\u93a2, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            var_7_80 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_147:int, ldc:int(64)), ldc:int(0))) {
                    var_2_147 = and:int(var_2_147:int, ldc:int(2114430446))
                }
                else {
                    var_2_147 = and:int(var_2_147:int, ldc:int(1757018364))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_7_80:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)) {
                        var_8_C0 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_7_80:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                        var_9_C7 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, var_8_C0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                        var_10_CD = invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u4c2b\u6198\u5245\u3bd6\u4bc8\uc29a, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
                        var_11_101 = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:double(mul:double(sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_10_CD:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_9_C7:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)), sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_10_CD:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_9_C7:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))), mul:double(sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_10_CD:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_9_C7:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)), sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_10_CD:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_9_C7:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)))))
                        var_12_11C = add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_9_C7:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), mul:double(f2d:double(div:float(ldc:float(13.0f), var_11_101:float)), sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_10_CD:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_9_C7:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))))
                        var_14_137 = add:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_9_C7:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), mul:double(f2d:double(div:float(ldc:float(13.0f), var_11_101:float)), sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_10_CD:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_9_C7:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8))))
                        
                        if (logicalor:boolean(cmple:boolean(var_11_101:float, ldc:float(64.0f)), invokeinterface:boolean(Collection::contains, var_6_72:Collection, var_8_C0:\u51fa\u6c52\u7330\u7330\u960f[expected:Object]))) {
                            var_2_147 = and:int(var_2_147:int, ldc:int(1525276906))
                            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_8_C0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u759a\u3504\u6b0d\u5245\ucb79(\u759a\u3504\u6b0d\u5245\ucb79::<init>, getstatic:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937(\ua068\uf995\u3711\u4bc8\u8c8a\u0c95::\uc9f6\u527a\u64f2\u6ec6\u4daf\u34df), getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\uc87f\u6bb9\u4975\u760c\u71f1\u3bd6), var_12_11C:double, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_8_C0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), var_14_137:double, ldc:float(64.0f), ldc:float(1.0f)))
                        }
                        
                        var_2_147 = and:int(var_2_147:int, ldc:int(-2031362565))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_147:int, ldc:int(524288)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u120d\ub1b9\uff55\u4c2b\u8709\ub6ab(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        var_4_69 : int
        var_5_77 : int
        var_6_86 : \u6d99\u6b0d\ubff1\uc246\u946b
        var_7_8C : boolean
        var_8_91 : \u8d90\ub6ab\u92ee\ucfaf\u8c8a[]
        var_9_96 : int
        var_10_9F : int
        var_11_DD : \u8d90\ub6ab\u92ee\ucfaf\u8c8a
        var_12_FA : int
        var_13_103 : int
        var_14_10C : int
        var_15_12E : \u3d4b\ub18d\u624e\uc2e8\u0c95
        var_16_18E : \u3d4b\ub18d\u624e\uc2e8\u0c95
        
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
            var_2_61 = and:int(ldc:int(1797666099), ldc:int(1298240947))
            var_4_69 = and:int(ldc:int(9121), ldc:int(-9126))
            var_5_77 = add:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u6c56\u836c\u98a4\u34df\u40a9, this:\ub83f\uc910\u4c2b\u446c\u71ae), xor:int(ldc:int(260), ldc:int(261)))
            putfield:float(\ub83f\uc910\u4c2b\u446c\u71ae::\u960f\u7c6b\u4f4a\u3776\u3a62\ubefe, this:\ub83f\uc910\u4c2b\u446c\u71ae, ldc:float(0.0f))
            var_6_86 = invokevirtual:\u6d99\u6b0d\ubff1\uc246\u946b(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7af6\u8350\u4179\ufe34\ub18d\ucfaf, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            var_7_8C = invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u516c\u836c\u1833\u6d69\u8753\u624e, this:\ub83f\uc910\u4c2b\u446c\u71ae)
            var_8_91 = invokestatic:\u8d90\ub6ab\u92ee\ucfaf\u8c8a[](\u8d90\ub6ab\u92ee\ucfaf\u8c8a::\ubb2b\u3e2a\ub8be\u446c\u47c2\u71ae)
            var_9_96 = arraylength:int(var_8_91:\u8d90\ub6ab\u92ee\ucfaf\u8c8a[])
            var_10_9F = and:int(ldc:int(-5607), ldc:int(5542))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(1099149175))
                
                if (cmpge:boolean(var_10_9F:int, var_9_96:int)) {
                    looporswitchbreak()
                }
                
                var_11_DD = loadelement:\u8d90\ub6ab\u92ee\ucfaf\u8c8a(var_8_91:\u8d90\ub6ab\u92ee\ucfaf\u8c8a[], var_10_9F:int)
                var_12_FA = add:int(invokespecial:int(\ub83f\uc910\u4c2b\u446c\u71ae::\ucef1\u71ae\uc246\u760c\uf94d\ubf56, this:\ub83f\uc910\u4c2b\u446c\u71ae, var_11_DD:\u8d90\ub6ab\u92ee\ucfaf\u8c8a, var_5_77:int, var_7_8C:boolean), invokespecial:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u624e\uc3e3\u69d9\uc910\u624e\u71ae, this:\ub83f\uc910\u4c2b\u446c\u71ae, var_11_DD:\u8d90\ub6ab\u92ee\ucfaf\u8c8a, getfield:Random(\ub83f\uc910\u4c2b\u446c\u71ae::\u3c25\u960f\u8bb0\u624e\ub32d\u4975, this:\ub83f\uc910\u4c2b\u446c\u71ae), var_5_77:int, var_6_86:\u6d99\u6b0d\ubff1\uc246\u946b, var_7_8C:boolean))
                var_13_103 = and:int(ldc:int(851), ldc:int(-980))
                var_14_10C = and:int(ldc:int(9551), ldc:int(-16336))
                
                while (cmplt:boolean(var_14_10C:int, var_12_FA:int)) {
                    var_15_12E = checkcast:\u3d4b\ub18d\u624e\uc2e8\u0c95(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95.class, invokevirtual:\u3d4b\ub18d\u624e\uc2e8\u0c95(\u9255\u0c95\u4cd9\ube23\u760c<\u3d4b\ub18d\u624e\uc2e8\u0c95>::\u7d52\u62da\uc29a\uc9f6\u51fa\u983f, invokestatic:\u9255\u0c95\u4cd9\ube23\u760c(\u8d90\ub6ab\u92ee\ucfaf\u8c8a::\u8709\u839e\u9af2\uc29a\u0800\u718f, var_11_DD:\u8d90\ub6ab\u92ee\ucfaf\u8c8a), getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
                    
                    if (cmpeq:boolean(var_4_69:int, ldc:int(0))) {
                        if (invokevirtual:boolean(\ubb2b\ube23\uafe7\ube23\u56bd::\u5654\u4179\u9a18\ufe34\u965f\u6fb0, var_15_12E:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\ubb2b\ube23\uafe7\ube23\u56bd])) {
                            invokevirtual:void(\ubb2b\ube23\uafe7\ube23\u56bd::\u4492\u5f50\ube23\u36d3\u3a62\u4d85, var_15_12E:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\ubb2b\ube23\uafe7\ube23\u56bd], xor:int[expected:boolean](ldc:int(8280), ldc:int(8281)))
                            invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u59ec\uae5d\u6c52\u64ab\ua6bd\uae87, this:\ub83f\uc910\u4c2b\u446c\u71ae, var_5_77:int, var_15_12E:\u3d4b\ub18d\u624e\uc2e8\u0c95)
                            var_4_69 = and:int(ldc:int(12419), ldc:int(18433))
                        }
                    }
                    
                    invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u3d64\u759a\u4daf\uc2e8\u1833\u6ec6, this:\ub83f\uc910\u4c2b\u446c\u71ae, var_5_77:int, var_15_12E:\u3d4b\ub18d\u624e\uc2e8\u0c95, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int[expected:boolean](ldc:int(24145), ldc:int(-24148)))
                    
                    if (cmpeq:boolean(invokestatic:\u9255\u0c95\u4cd9\ube23\u760c(\u8d90\ub6ab\u92ee\ucfaf\u8c8a::\u8709\u839e\u9af2\uc29a\u0800\u718f, var_11_DD:\u8d90\ub6ab\u92ee\ucfaf\u8c8a), getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u156b\ubff1\uc9f6\u6b0d\u647c>(\u9255\u0c95\u4cd9\ube23\u760c::\ucef1\uc229\u624e\u8cae\u9033\u12b2))) {
                        var_16_18E = aconstnull:\u3d4b\ub18d\u624e\uc2e8\u0c95()
                        
                        if (cmpne:boolean(var_5_77:int, invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u4975\u47c2\uc84e\u392e\u5140\ub19c, this:\ub83f\uc910\u4c2b\u446c\u71ae, getstatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u4c2b\ud217\u3776\u9af2\uc31c\ud217)))) {
                            if (cmpge:boolean(var_5_77:int, invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u4975\u47c2\uc84e\u392e\u5140\ub19c, this:\ub83f\uc910\u4c2b\u446c\u71ae, getstatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u5fe1\u69d9\u0c95\u6b0d\u7c6b\ub19c)))) {
                                if (cmpne:boolean(var_13_103:int, ldc:int(0))) {
                                    var_16_18E = checkcast:\uc4d2\u4179\u67d0\u494c\u36d3[expected:\u3d4b\ub18d\u624e\uc2e8\u0c95](\u927d\u92ff\u71ae\uafe7\u6bb9.\uc4d2\u4179\u67d0\u494c\u36d3.class, invokevirtual:\uc4d2\u4179\u67d0\u494c\u36d3(\u9255\u0c95\u4cd9\ube23\u760c<\uc4d2\u4179\u67d0\u494c\u36d3>::\u7d52\u62da\uc29a\uc9f6\u51fa\u983f, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\uc4d2\u4179\u67d0\u494c\u36d3>(\u9255\u0c95\u4cd9\ube23\u760c::\u4cd9\u7c6b\u8308\u76bc\u7c6b\u7043), getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
                                }
                                else {
                                    var_16_18E = checkcast:\uf94d\u4f4a\u92ee\u4975\u3d64[expected:\u3d4b\ub18d\u624e\uc2e8\u0c95](\u36d3\u9033\u6b0d\u983f\u8d90.\uf94d\u4f4a\u92ee\u4975\u3d64.class, invokevirtual:\uf94d\u4f4a\u92ee\u4975\u3d64(\u9255\u0c95\u4cd9\ube23\u760c<\uf94d\u4f4a\u92ee\u4975\u3d64>::\u7d52\u62da\uc29a\uc9f6\u51fa\u983f, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\uf94d\u4f4a\u92ee\u4975\u3d64>(\u9255\u0c95\u4cd9\ube23\u760c::\u9033\u7bad\u3bd6\u6cfe\uc2e8\ubf56), getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
                                }
                            }
                        }
                        else {
                            var_16_18E = checkcast:\u59ec\u647c\ucb79\u64ab\u6198[expected:\u3d4b\ub18d\u624e\uc2e8\u0c95](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u59ec\u647c\ucb79\u64ab\u6198.class, invokevirtual:\u59ec\u647c\ucb79\u64ab\u6198(\u9255\u0c95\u4cd9\ube23\u760c<\u59ec\u647c\ucb79\u64ab\u6198>::\u7d52\u62da\uc29a\uc9f6\u51fa\u983f, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u59ec\u647c\ucb79\u64ab\u6198>(\u9255\u0c95\u4cd9\ube23\u760c::\u3bd6\u4cd9\u6b5f\u3776\u7e3f\u516c), getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
                        }
                        
                        inc:int(var_13_103, ldc:int(1))
                        
                        if (cmpne:boolean(var_16_18E:\u3d4b\ub18d\u624e\uc2e8\u0c95, aconstnull:\u3d4b\ub18d\u624e\uc2e8\u0c95())) {
                            invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u3d64\u759a\u4daf\uc2e8\u1833\u6ec6, this:\ub83f\uc910\u4c2b\u446c\u71ae, var_5_77:int, var_16_18E:\u3d4b\ub18d\u624e\uc2e8\u0c95, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int[expected:boolean](ldc:int(22930), ldc:int(-22935)))
                            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u5db4\u4cd9\ub7dc\ucfaf\ub18d\u071d, var_16_18E:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, ldc:float(0.0f), ldc:float(0.0f))
                            invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u67d0\u120d\u494c\uc87f\ud217\u93a2, var_16_18E:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f], var_15_12E:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                        }
                    }
                    
                    inc:int(var_14_10C, ldc:int(1))
                }
                
                inc:int(var_10_9F, ldc:int(1))
            }
            
            putfield:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ub83f\uc910\u4c2b\u446c\u71ae::\u1187\u836c\u8258\ubff1\u8aa5\uc4d2, this:\ub83f\uc910\u4c2b\u446c\u71ae, invokestatic:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Optional<T>::empty))
            putfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u6c56\u836c\u98a4\u34df\u40a9, this:\ub83f\uc910\u4c2b\u446c\u71ae, add:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u6c56\u836c\u98a4\u34df\u40a9, this:\ub83f\uc910\u4c2b\u446c\u71ae), xor:int(ldc:int(4620), ldc:int(4621))))
            invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u156b\u6c56\u51b2\u0a06\u40a9\u2dcc, this:\ub83f\uc910\u4c2b\u446c\u71ae)
            invokespecial:void(\ub83f\uc910\u4c2b\u446c\u71ae::\uc87f\u6b0d\u183a\uc238\u416d\u3e75, this:\ub83f\uc910\u4c2b\u446c\u71ae)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3d64\u759a\u4daf\uc2e8\u1833\u6ec6(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, boolean p3) {
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
            
            if (invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u3d64\u759a\u4daf\uc2e8\u1833\u6ec6, this:\ub83f\uc910\u4c2b\u446c\u71ae, p0:int, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95)) {
                invokevirtual:void(\u3d4b\ub18d\u624e\uc2e8\u0c95::\ube23\u6d99\u9255\u97e6\uc2bd\u64ab, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                invokevirtual:void(\u3d4b\ub18d\u624e\uc2e8\u0c95::\u836c\u5654\uf9c5\ub18d\u5f50\u6198, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95, p0:int)
                invokevirtual:void(\u3d4b\ub18d\u624e\uc2e8\u0c95::\ud36e\u6bb9\u8258\u6ec6\u12b2\ud158, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95, and:int[expected:boolean](ldc:int(7169), ldc:int(553)))
                invokevirtual:void(\u3d4b\ub18d\u624e\uc2e8\u0c95::\ua3b4\u839e\uc9f6\uc29a\u4cd9\ud523, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95, and:int(ldc:int(2595), ldc:int(-2660)))
                
                if (logicalnot:boolean(p3:boolean)) {
                    if (cmpne:boolean(p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                        invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\u6d99\u1187\ucb79\u7d52\u7e3f, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f], add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(1.0)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)))
                        invokevirtual:\u120d\u98a4\uceb8\u8cae\u47c2(\u3d4b\ub18d\u624e\uc2e8\u0c95::\uc3e3\u183a\u8640\ud171\uafe7\u1833, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\ua6bd\u8d98\u6ec6\uc246\uc238](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokevirtual:\u6d99\u6b0d\ubff1\uc246\u946b(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7af6\u8350\u4179\ufe34\ub18d\ucfaf, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u5f50\u3e75\u51fa\u983f\u67e9(\u5f50\u3e75\u51fa\u983f\u67e9::\u88c5\ud12e\u74b1\u4c04\ud4fe\u34df), checkcast:\u120d\u98a4\uceb8\u8cae\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u120d\u98a4\uceb8\u8cae\u47c2.class, aconstnull:\u120d\u98a4\uceb8\u8cae\u47c2()), checkcast:\uc31c\uc87f\uc246\u3776\ub7dc(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc.class, aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc()))
                        invokevirtual:void(\u3d4b\ub18d\u624e\uc2e8\u0c95::\uc9f6\ub19c\ucef1\ub83f\u760c\u7330, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95, p0:int, and:int[expected:boolean](ldc:int(15877), ldc:int(-32270)))
                        invokevirtual:void(\ube23\u67d0\u64f2\u839e\u76bc::\ub171\ub113\u120d\u6b5f\u8709\ud51e, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\ube23\u67d0\u64f2\u839e\u76bc], xor:int[expected:boolean](ldc:int(258), ldc:int(259)))
                        invokevirtual:void(\ua6bd\u8d98\u6ec6\uc246\uc238::\u624e\ub113\u3a62\u93a2\u6cfe\u6fb0, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\ua6bd\u8d98\u6ec6\uc246\uc238](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), p1:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u156b\u6c56\u51b2\u0a06\u40a9\u2dcc() {
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
            invokevirtual:void(\u61a4\u51b2\u7330\ubb2b\u3504::\u47c2\u12b2\u8350\u67e9\u416d\u120d, getfield:\u61a4\u51b2\u7330\ubb2b\u3504(\ub83f\uc910\u4c2b\u446c\u71ae::\u446c\u8d90\u62da\u718f\ucef1\uf94d, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, div:float(invokevirtual:float(\ub83f\uc910\u4c2b\u446c\u71ae::\u3d64\u527a\uc4d2\ud158\u7006\uc4d2, this:\ub83f\uc910\u4c2b\u446c\u71ae), getfield:float(\ub83f\uc910\u4c2b\u446c\u71ae::\u960f\u7c6b\u4f4a\u3776\u3a62\ubefe, this:\ub83f\uc910\u4c2b\u446c\u71ae)), ldc:float(0.0f), ldc:float(1.0f)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \u3d64\u527a\uc4d2\ud158\u7006\uc4d2() {
        var_1_BA : int
        var_3_63 : float
        var_4_72 : Iterator<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>
        var_6_B3 : Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>
        
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
            var_1_BA = and:int(ldc:int(1947569638), ldc:int(-143227410))
            var_3_63 = ldc:float(0.0f)
            var_4_72 = invokeinterface:Iterator<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(Collection<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>::iterator, invokeinterface:Collection<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>::values, getfield:Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(\ub83f\uc910\u4c2b\u446c\u71ae::\ua3b4\u2dcc\u4c04\uc84e\u47c2\u3bd6, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_BA:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_BA = and:int(var_1_BA:int, ldc:int(2095031422))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_72:Iterator<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>)) {
                        var_6_B3 = invokeinterface:Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>(Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>::iterator, checkcast:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>(java.util.Set<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95>.class, invokeinterface:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>(Iterator<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>::next, var_4_72:Iterator<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>)))
                        
                        loop {
                            var_1_BA = and:int(var_1_BA:int, ldc:int(-141173001))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_B3:Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>))) {
                                looporswitchbreak()
                            }
                            
                            var_3_63 = add:float(var_3_63:float, invokevirtual:float(\ube23\u67d0\u64f2\u839e\u76bc::\u120d\u51fa\u6d69\ubded\u97e6\u0a06, checkcast:\u3d4b\ub18d\u624e\uc2e8\u0c95(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95.class, invokeinterface:\u3d4b\ub18d\u624e\uc2e8\u0c95(Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>::next, var_6_B3:Iterator<\u3d4b\ub18d\u624e\uc2e8\u0c95>))))
                        }
                        
                        var_1_BA = and:int(var_1_BA:int, ldc:int(-166287897))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_BA:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:float(var_3_63:float)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u0800\u5fe1\u9255\u93a2\u7043\u99f7() {
        var_1_7F : int
        stack_D7_0 : int [generated]
        
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
            var_1_7F = and:int(ldc:int(440047281), ldc:int(-885327874))
            
            if (cmpeq:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(0))) {
                if (cmplt:boolean(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u6c56\u836c\u98a4\u34df\u40a9, this:\ub83f\uc910\u4c2b\u446c\u71ae), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\ub113\u6d99\u7006\uc31c\u965f\ub70c, this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                    goto(Label_0153)
                }
                
                if (invokespecial:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u516c\u836c\u1833\u6d69\u8753\u624e, this:\ub83f\uc910\u4c2b\u446c\u71ae)) {
                    goto(Label_0153)
                }
            }
            
            Label_0105:
            
            if (cmpeq:boolean(and:int(var_1_7F:int, ldc:int(262144)), ldc:int(0))) {
                var_1_7F = and:int(var_1_7F:int, ldc:int(-608453062))
                stack_D7_0 = and:int[expected:boolean](ldc:int(-13221), ldc:int(13092))
                return:boolean(stack_D7_0:boolean)
            }
            
            var_1_7F = and:int(var_1_7F:int, ldc:int(-616364723))
            Label_0153:
            
            if (cmpne:boolean(and:int(var_1_7F:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0105)
            }
            
            var_1_7F = and:int(var_1_7F:int, ldc:int(-4679684))
            
            if (cmpne:boolean(invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc246\u927d\u416d\ubb2b\ua3b4\u93a2, this:\ub83f\uc910\u4c2b\u446c\u71ae), ldc:int(0))) {
                goto(Label_0105)
            }
            
            stack_D7_0 = xor:int[expected:boolean](ldc:int(20492), ldc:int(20493))
            return:boolean(stack_D7_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public int \uc246\u927d\u416d\ubb2b\ua3b4\u93a2() {
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
            return:int(invokeinterface:int(IntStream::sum, invokeinterface:IntStream(Stream<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>::mapToInt, invokeinterface:Stream<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(Collection<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>::stream, invokeinterface:Collection<Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>::values, getfield:Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(\ub83f\uc910\u4c2b\u446c\u71ae::\ua3b4\u2dcc\u4c04\uc84e\u47c2\u3bd6, this:\ub83f\uc910\u4c2b\u446c\u71ae))), invokedynamic:ToIntFunction<? super Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(applyAsInt:()Ljava/util/function/ToIntFunction;))))
        }
        
        goto(Label_0006)
    }
    
    public void \u156b\uf995\u3e75\u5245\u8640\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95 p0, boolean p1) {
        var_3_61 : int
        var_5_75 : Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>
        
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
            var_3_61 = and:int(ldc:int(-2000132114), ldc:int(2072211119))
            var_5_75 = checkcast:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>(java.util.Set<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95>.class, invokeinterface:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>(Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>::get, getfield:Map<Integer, Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>>(\ub83f\uc910\u4c2b\u446c\u71ae::\ua3b4\u2dcc\u4c04\uc84e\u47c2\u3bd6, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u3d4b\ub18d\u624e\uc2e8\u0c95::\ucb79\uc910\uae5d\u4e72\u64ab\u4492, p0:\u3d4b\ub18d\u624e\uc2e8\u0c95))))
            
            if (cmpne:boolean(var_5_75:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>, aconstnull:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>())) {
                if (invokeinterface:boolean(Set<E>::remove, var_5_75:Set<\u3d4b\ub18d\u624e\uc2e8\u0c95>, p0:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:Object])) {
                    if (p1:boolean) {
                        putfield:float(\ub83f\uc910\u4c2b\u446c\u71ae::\u960f\u7c6b\u4f4a\u3776\u3a62\ubefe, this:\ub83f\uc910\u4c2b\u446c\u71ae, sub:float(getfield:float(\ub83f\uc910\u4c2b\u446c\u71ae::\u960f\u7c6b\u4f4a\u3776\u3a62\ubefe, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokevirtual:float(\ube23\u67d0\u64f2\u839e\u76bc::\u120d\u51fa\u6d69\ubded\u97e6\u0a06, p0:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\ube23\u67d0\u64f2\u839e\u76bc])))
                    }
                    
                    var_3_61 = and:int(var_3_61:int, ldc:int(2040200891))
                    invokevirtual:void(\u3d4b\ub18d\u624e\uc2e8\u0c95::\ube23\u6d99\u9255\u97e6\uc2bd\u64ab, p0:\u3d4b\ub18d\u624e\uc2e8\u0c95, checkcast:\ub83f\uc910\u4c2b\u446c\u71ae(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\ub83f\uc910\u4c2b\u446c\u71ae.class, aconstnull:\ub83f\uc910\u4c2b\u446c\u71ae()))
                    invokevirtual:void(\ub83f\uc910\u4c2b\u446c\u71ae::\u156b\u6c56\u51b2\u0a06\u40a9\u2dcc, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                    invokespecial:void(\ub83f\uc910\u4c2b\u446c\u71ae::\uc87f\u6b0d\u183a\uc238\u416d\u3e75, this:\ub83f\uc910\u4c2b\u446c\u71ae)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc87f\u6b0d\u183a\uc238\u416d\u3e75() {
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
            invokevirtual:void(\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217::\u9033\u5fe1\u416d\u5f50\uff55\ub1b9, invokevirtual:\uafe7\ua61f\u4f4a\u9af2\uae5d[expected:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217](\ube23\uc238\u5140\u4cd9\u8aa5::\u647c\u8413\uceb8\ub18d\u527a\ub19c, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \uc87f\ub113\uc4d2\u8df4\u12cb\u156b() {
        var_2_6C : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
            var_2_6C = initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ub32d\u6cfe\uc84e\u5140\u69d9\u8709))
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\u8258\uae87\u8aa5\ubefe\u7006, var_2_6C:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(8375), ldc:int(2073)))), loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(18), ldc:int(6550))), invokevirtual:\ud158\u8308\u76bc\u0a06\ud36e[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u7bad\uceb8\u071d\u2dcc\u3bc9::\u983f\ua068\u7af6\u4c2b\u8640\u1833, invokevirtual:\u7bad\uceb8\u071d\u2dcc\u3bc9(\u7bad\uceb8\u071d\u2dcc\u3bc9::\u8c8a\u873d\uc2e8\ucef1\u4ab3\u071d, invokevirtual:\u7bad\uceb8\u071d\u2dcc\u3bc9(\u7bad\uceb8\u071d\u2dcc\u3bc9::\u8c8a\u873d\uc2e8\ucef1\u4ab3\u071d, invokevirtual:\u7bad\uceb8\u071d\u2dcc\u3bc9(\u7bad\uceb8\u071d\u2dcc\u3bc9::\u8c8a\u873d\uc2e8\ucef1\u4ab3\u071d, invokevirtual:\u7bad\uceb8\u071d\u2dcc\u3bc9(\u7bad\uceb8\u071d\u2dcc\u3bc9::\u8c8a\u873d\uc2e8\ucef1\u4ab3\u071d, invokevirtual:\u7bad\uceb8\u071d\u2dcc\u3bc9(\u7bad\uceb8\u071d\u2dcc\u3bc9::\u8c8a\u873d\uc2e8\ucef1\u4ab3\u071d, invokevirtual:\u7bad\uceb8\u071d\u2dcc\u3bc9(\u7bad\uceb8\u071d\u2dcc\u3bc9::\u8c8a\u873d\uc2e8\ucef1\u4ab3\u071d, invokevirtual:\u7bad\uceb8\u071d\u2dcc\u3bc9(\u7bad\uceb8\u071d\u2dcc\u3bc9::\u8c8a\u873d\uc2e8\ucef1\u4ab3\u071d, invokevirtual:\u7bad\uceb8\u071d\u2dcc\u3bc9(\u7bad\uceb8\u071d\u2dcc\u3bc9::\u8c8a\u873d\uc2e8\ucef1\u4ab3\u071d, initobject:\u7bad\uceb8\u071d\u2dcc\u3bc9(\u7bad\uceb8\u071d\u2dcc\u3bc9::<init>), getstatic:\u0c95\ubf56\uc29a\ua068\u97e6(\u0c95\ubf56\uc29a\ua068\u97e6::\u3bc9\u74b1\u120d\ufcaf\u7006\u6cfe), getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\u74b1\u5db4\u183a\u647c\u59ec\u6b0d)), getstatic:\u0c95\ubf56\uc29a\ua068\u97e6(\u0c95\ubf56\uc29a\ua068\u97e6::\u56bd\ube23\ua61f\u4e72\u6bb9\u8cae), getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\u7bad\u8c8a\ub32d\ua562\u3d64\u4f52)), getstatic:\u0c95\ubf56\uc29a\ua068\u97e6(\u0c95\ubf56\uc29a\ua068\u97e6::\u983f\u64f2\ufe34\ud523\u516c\u40a9), getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\u4cd9\u983f\u40a9\u71ae\u5bc4\uc246)), getstatic:\u0c95\ubf56\uc29a\ua068\u97e6(\u0c95\ubf56\uc29a\ua068\u97e6::\ud12e\u8bb0\u7d52\uceb8\u7873\u8bb0), getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\u7bad\u8c8a\ub32d\ua562\u3d64\u4f52)), getstatic:\u0c95\ubf56\uc29a\ua068\u97e6(\u0c95\ubf56\uc29a\ua068\u97e6::\ub19c\ucfaf\u72f1\ud51e\u5245\u3c25), getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\u965f\u7873\ub19c\u3d64\uc2bd\u99f7)), getstatic:\u0c95\ubf56\uc29a\ua068\u97e6(\u0c95\ubf56\uc29a\ua068\u97e6::\u8bb0\ub7dc\uf9c5\u92ff\u3d4b\u7ce1), getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\u7bad\u8c8a\ub32d\ua562\u3d64\u4f52)), getstatic:\u0c95\ubf56\uc29a\ua068\u97e6(\u0c95\ubf56\uc29a\ua068\u97e6::\ua562\u8350\u7ce1\u4c04\u36d3\ud217), getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\u7bad\u8c8a\ub32d\ua562\u3d64\u4f52)), getstatic:\u0c95\ubf56\uc29a\ua068\u97e6(\u0c95\ubf56\uc29a\ua068\u97e6::\ud12e\u8bb0\u7d52\uceb8\u7873\u8bb0), getstatic:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\u965f\u7873\ub19c\u3d64\uc2bd\u99f7))))
            invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uae87\u9937\u156b\uc9f6\u7c6b\u4f52, var_2_6C:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, getstatic:\u99f7\u36d3\uc29a\u34df\u7c6b\ubb2b(\u99f7\u36d3\uc29a\u34df\u7c6b\ubb2b::\u12cb\u4f52\ucef1\u516c\u5db4\u69d9))
            invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uc4d2\u4e72\u88c5\ud158\u4e72\u8c8a, var_2_6C:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, invokevirtual:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent[expected:IFormattableTextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(20499), ldc:int(1303)))), getstatic:TextFormatting(TextFormatting::GOLD)))
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(var_2_6C:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95 \u759a\u5d20\u7e3f\u51fa\u4f52\u759a(int p0) {
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
            return:\u3d4b\ub18d\u624e\uc2e8\u0c95(checkcast:\u3d4b\ub18d\u624e\uc2e8\u0c95(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95.class, invokeinterface:\u3d4b\ub18d\u624e\uc2e8\u0c95(Map<Integer, \u3d4b\ub18d\u624e\uc2e8\u0c95>::get, getfield:Map<Integer, \u3d4b\ub18d\u624e\uc2e8\u0c95>(\ub83f\uc910\u4c2b\u446c\u71ae::\ucef1\u647c\u6cfe\u92ee\ud171\u72f1, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokestatic:Integer[expected:Object](Integer::valueOf, p0:int))))
        }
        
        goto(Label_0006)
    }
    
    private \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u3d64\u156b\ud12e\ud12e\u5654\ubf56(int p0, int p1) {
        var_3_61 : int
        stack_89_0 : int [generated]
        var_3_162 : int
        var_5_89 : int
        var_6_92 : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_7_9B : int
        var_8_D3 : float
        var_9_FF : int
        var_10_12B : int
        
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
            var_3_61 = and:int(ldc:int(789140828), ldc:int(-281185302))
            
            if (cmpne:boolean(p0:int, ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(200566202))
                stack_89_0 = sub:int(and:int(ldc:int(17450), ldc:int(2439)), p0:int)
            }
            else {
                stack_89_0 = and:int(ldc:int(24590), ldc:int(3218))
            }
            
            var_3_162 = and:int(var_3_61:int, ldc:int(-890543))
            var_5_89 = stack_89_0:int
            var_6_92 = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
            var_7_9B = and:int(ldc:int(-23534), ldc:int(23180))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_162:int, ldc:int(32768)), ldc:int(0))) {
                    var_3_162 = and:int(var_3_162:int, ldc:int(1062066129))
                    
                    if (cmplt:boolean(var_7_9B:int, p1:int)) {
                        var_8_D3 = mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae))), ldc:float(6.2831855f))
                        var_9_FF = add:int(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae)), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_8_D3:float), ldc:float(32.0f)), i2f:float(var_5_89:int)))), invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)), xor:int(ldc:int(287), ldc:int(282))))
                        var_10_12B = add:int(add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae)), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, mul:float(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_8_D3:float), ldc:float(32.0f)), i2f:float(var_5_89:int)))), invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)), and:int(ldc:int(29205), ldc:int(141))))
                        invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\ucb79\u3bc9\u494c\u6d99\uc2e8\uae87, var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_9_FF:int, invokevirtual:int(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\u47c2\u8308\u7330\u93a2\u5bc4\u839e), var_9_FF:int, var_10_12B:int), var_10_12B:int)
                        
                        if (invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\ub7dc\u873d\u6b0d\u4ab3\u6fb0, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])) {
                            if (cmplt:boolean(p0:int, xor:int(ldc:int(283), ldc:int(281)))) {
                                goto(Label_0422)
                            }
                        }
                        
                        Label_0341:
                        
                        if (cmpne:boolean(and:int(var_3_162:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_162 = and:int(var_3_162:int, ldc:int(1428890702))
                        }
                        else {
                            var_3_162 = and:int(var_3_162:int, ldc:int(-282110605))
                            
                            if (invokevirtual:boolean(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\uc31c\u6c52\u5bc4\ud523\u64f2\ub6ab, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)), add:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), ldc:int(10)))) {
                                if (invokevirtual:boolean(\u69d9\u759a\u64ab\ua3b4\u6b0d::\ufcaf\u67e9\u873d\u8709\ud51e\u97b7, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae)), initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]))) {
                                    if (invokestatic:boolean(\ud7e8\ud171\u9937\u647c\u6b5f\ud523::\u5d20\u839e\u5f50\ua068\uc2e8\u416d, getstatic:\u8640\u51fa\u5f50\u4492\u8258(\u8640\u51fa\u5f50\u4492\u8258::\u40a9\u946b\u36d3\uc229\u416d\uc238), getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u156b\ubff1\uc9f6\u6b0d\u647c>(\u9255\u0c95\u4cd9\ube23\u760c::\ucef1\uc229\u624e\u8cae\u9033\u12b2))) {
                                        looporswitchbreak()
                                    }
                                    
                                    if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])), getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u494c\u3dd3\u12cb\u56bd\uc238\u2dcc))) {
                                        if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, getfield:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]))) {
                                            looporswitchbreak()
                                        }
                                    }
                                }
                            }
                        }
                        
                        Label_0422:
                        
                        if (cmpeq:boolean(and:int(var_3_162:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_162 = and:int(var_3_162:int, ldc:int(923883434))
                            goto(Label_0341)
                        }
                        
                        var_3_162 = and:int(var_3_162:int, ldc:int(1542015846))
                        inc:int(var_7_9B, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_162:int, ldc:int(32768)), ldc:int(0))) {
                    return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())
                }
            }
            
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(var_6_92:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])
        }
        
        goto(Label_0006)
    }
    
    private boolean \u3d64\u759a\u4daf\uc2e8\u1833\u6ec6(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95 p1) {
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
            return:boolean(invokevirtual:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\u3d64\u759a\u4daf\uc2e8\u1833\u6ec6, this:\ub83f\uc910\u4c2b\u446c\u71ae, p0:int, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95, and:int[expected:boolean](ldc:int(13329), ldc:int(16615))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3d64\u759a\u4daf\uc2e8\u1833\u6ec6(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95 p1, boolean p2) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \u59ec\uae5d\u6c52\u64ab\ua6bd\uae87(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3d4b\ub18d\u624e\uc2e8\u0c95 p1) {
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
            invokeinterface:\u3d4b\ub18d\u624e\uc2e8\u0c95(Map<Integer, \u3d4b\ub18d\u624e\uc2e8\u0c95>::put, getfield:Map<Integer, \u3d4b\ub18d\u624e\uc2e8\u0c95>(\ub83f\uc910\u4c2b\u446c\u71ae::\ucef1\u647c\u6cfe\u92ee\ud171\u72f1, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokestatic:Integer(Integer::valueOf, p0:int), p1:\u3d4b\ub18d\u624e\uc2e8\u0c95)
            invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\ufe34\u64f2\u392e\u7af6\u960f\u71f1, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\u4f4a\uafe7\u76bc\u392e\ub8be], getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\u8709\uc229\u4179\u8258\ua3b4\u97b7), invokestatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ub83f\uc910\u4c2b\u446c\u71ae::\uc87f\ub113\uc4d2\u8df4\u12cb\u156b))
            invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\u3d64\u718f\u8df4\u527a\u67e9\u56bd, p1:\u3d4b\ub18d\u624e\uc2e8\u0c95[expected:\u4f4a\uafe7\u76bc\u392e\ub8be], getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\u8709\uc229\u4179\u8258\ua3b4\u97b7), ldc:float(2.0f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub1b9\u8640\u120d\u7ce1\u71f1\u2dcc(int p0) {
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
            invokeinterface:\u3d4b\ub18d\u624e\uc2e8\u0c95(Map<Integer, \u3d4b\ub18d\u624e\uc2e8\u0c95>::remove, getfield:Map<Integer, \u3d4b\ub18d\u624e\uc2e8\u0c95>(\ub83f\uc910\u4c2b\u446c\u71ae::\ucef1\u647c\u6cfe\u92ee\ud171\u72f1, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokestatic:Integer[expected:Object](Integer::valueOf, p0:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u4daf\u3776\u965f\ud7e8\ud4fe\u7873() {
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
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae))
        }
        
        goto(Label_0006)
    }
    
    private void \u8389\u52d3\u7af6\u416d\u67e9\u983f(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u927d\u8413\u7873\uc31c\u3c25\u12cb() {
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
            return:int(getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u62da\u92ee\u62da\u3dd3\u4bc8\u92ff, this:\ub83f\uc910\u4c2b\u446c\u71ae))
        }
        
        goto(Label_0006)
    }
    
    private int \ucef1\u71ae\uc246\u760c\uf94d\ubf56(\u12b2\u7049\u8df4\uc9f6\uae87.\u8d90\ub6ab\u92ee\ucfaf\u8c8a p0, int p1, boolean p2) {
        var_4_63 : int
        stack_8F_0 : int [generated]
        
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
            var_4_63 = and:int(ldc:int(-1289619125), ldc:int(-1484914753))
            
            if (logicalnot:boolean(p2:boolean)) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1208914001))
                stack_8F_0 = loadelement:int(invokestatic:int[](\u8d90\ub6ab\u92ee\ucfaf\u8c8a::\uf9c5\ub70c\u6d99\u8389\ub32d\ubefe, p0:\u8d90\ub6ab\u92ee\ucfaf\u8c8a), p1:int)
            }
            else {
                stack_8F_0 = loadelement:int(invokestatic:int[](\u8d90\ub6ab\u92ee\ucfaf\u8c8a::\uf9c5\ub70c\u6d99\u8389\ub32d\ubefe, p0:\u8d90\ub6ab\u92ee\ucfaf\u8c8a), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\ub113\u6d99\u7006\uc31c\u965f\ub70c, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            }
            
            return:int(stack_8F_0:int)
        }
        
        goto(Label_0006)
    }
    
    private int \u624e\uc3e3\u69d9\uc910\u624e\u71ae(\u12b2\u7049\u8df4\uc9f6\uae87.\u8d90\ub6ab\u92ee\ucfaf\u8c8a p0, java.util.Random p1, int p2, \u516c\u3d64\u718f\ub171\u6b5f.\u6d99\u6b0d\ubff1\uc246\u946b p3, boolean p4) {
        var_6_9C : int
        var_8_72 : \u8753\u0800\u4f4a\u4975\u64ab\u4c04
        stack_BB_0 : int [generated]
        var_6_F0 : int
        var_9_BB : int
        stack_10F_0 : int [generated]
        var_6_950 : int
        var_10_10F : int
        var_11_47C : int
        stack_8DC_0 : int [generated]
        stack_976_0 : int [generated]
        
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
            var_6_9C = and:int(and:int(ldc:int(1560325116), ldc:int(-67989548)), ldc:int(-105062436))
            var_8_72 = invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u6d99\u6b0d\ubff1\uc246\u946b::\uc3e3\u3776\u8413\u1187\ufcaf\uc87f, p3:\u6d99\u6b0d\ubff1\uc246\u946b)
            
            do {
                if (cmpne:boolean(and:int(var_6_9C:int, ldc:int(512)), ldc:int(0))) {
                    var_6_9C = and:int(var_6_9C:int, ldc:int(1563736062))
                    
                    if (cmpeq:boolean(var_8_72:\u8753\u0800\u4f4a\u4975\u64ab\u4c04, getstatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u97b7\u61a4\u62da\u5654\uc84e\ub6ab))) {
                        loopcontinue()
                    }
                    
                    stack_BB_0 = and:int(ldc:int(2822), ldc:int(-23528))
                    Label_0179:
                    var_6_F0 = and:int(var_6_9C:int, ldc:int(-1248485434))
                    var_9_BB = stack_BB_0:int
                    
                    do {
                        if (cmpeq:boolean(and:int(var_6_F0:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_6_F0 = and:int(var_6_F0:int, ldc:int(1513331610))
                        }
                        else {
                            var_6_F0 = and:int(var_6_F0:int, ldc:int(905731054))
                            
                            if (cmpeq:boolean(var_8_72:\u8753\u0800\u4f4a\u4975\u64ab\u4c04, getstatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u4c2b\ud217\u3776\u9af2\uc31c\ud217))) {
                                loopcontinue()
                            }
                            
                            stack_10F_0 = and:int(ldc:int(-13325), ldc:int(13324))
                            Label_0263:
                            var_6_950 = and:int(var_6_F0:int, ldc:int(1404238812))
                            var_10_10F = stack_10F_0:int
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(824321218))
                                    goto(Label_2075)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(2)), ldc:int(0))) {
                                    goto(Label_1939)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(87907682))
                                    goto(Label_1714)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(2002402583))
                                    goto(Label_1550)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(268435456)), ldc:int(0))) {
                                    goto(Label_1350)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(512)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-1510521955))
                                    goto(Label_1208)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_0976)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_0801)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_0626)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(403893856))
                                }
                                else {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1594118119))
                                    
                                    switch (loadelement:int(getstatic:int[](\ud7e8\uc2bd\uc238\ubb2b\u7330::\u839e\uc3e3\u3e2a\u5140\uc29a\u67d0), invokevirtual:int(Enum<E>::ordinal, p0:\u8d90\ub6ab\u92ee\ucfaf\u8c8a[expected:Enum<\u8d90\ub6ab\u92ee\ucfaf\u8c8a>]))) {
                                        case 1:
                                            if (cmpeq:boolean(var_9_BB:int, ldc:int(0))) {
                                                looporswitchbreak()
                                            }
                                            
                                            goto(Label_0976)
                                        
                                        case 2:
                                        case 3:
                                            if (cmpne:boolean(var_9_BB:int, ldc:int(0))) {
                                                goto(Label_1208)
                                            }
                                            
                                            if (cmpne:boolean(var_10_10F:int, ldc:int(0))) {
                                                goto(Label_1550)
                                            }
                                            
                                            var_11_47C = xor:int(ldc:int(530), ldc:int(528))
                                            goto(Label_1859)
                                        
                                        case 4:
                                            if (cmpeq:boolean(var_9_BB:int, ldc:int(0))) {
                                                goto(Label_1939)
                                            }
                                            
                                            looporswitchbreak(Label_2253)
                                        
                                        default:
                                            return:int(and:int(ldc:int(11856), ldc:int(-11889)))
                                    }
                                }
                                
                                Label_0473:
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-589049660))
                                    goto(Label_2075)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                    goto(Label_1939)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1355655965))
                                    goto(Label_1714)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1550)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_1350)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                    goto(Label_1208)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_0976)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(2)), ldc:int(0))) {
                                    goto(Label_0801)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(241666863))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(-1009490228))
                                        loopcontinue()
                                    }
                                    
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-1309676561))
                                    
                                    if (cmple:boolean(p2:int, xor:int(ldc:int(-32767), ldc:int(-32765)))) {
                                        goto(Label_0976)
                                    }
                                }
                                
                                Label_0626:
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1873074485))
                                    goto(Label_2075)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-316954980))
                                    goto(Label_1939)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                    goto(Label_1714)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                    goto(Label_1550)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-1146524265))
                                    goto(Label_1350)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1208)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-931509369))
                                    goto(Label_0976)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4096)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-53041591))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0473)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(2)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(2127809008))
                                        loopcontinue()
                                    }
                                    
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1400890332))
                                    
                                    if (cmpne:boolean(p2:int, and:int(ldc:int(25628), ldc:int(4871)))) {
                                        var_11_47C = xor:int(ldc:int(9), ldc:int(8))
                                        goto(Label_1150)
                                    }
                                }
                                
                                Label_0801:
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(512)), ldc:int(0))) {
                                    goto(Label_2075)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(64)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-895110487))
                                    goto(Label_1939)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(512)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(727569824))
                                    goto(Label_1714)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_1550)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1504814596))
                                    goto(Label_1350)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-1720917973))
                                    goto(Label_1208)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(128)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-511134300))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(787694197))
                                        goto(Label_0626)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(16777216)), ldc:int(0))) {
                                        goto(Label_0473)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(-504552501))
                                        loopcontinue()
                                    }
                                    
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1609908197))
                                }
                                
                                Label_0976:
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_2075)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(64)), ldc:int(0))) {
                                    goto(Label_1939)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(512)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-413085189))
                                    goto(Label_1714)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(627900705))
                                    goto(Label_1550)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(16384)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-37873295))
                                    goto(Label_1350)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(2)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-904382132))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0801)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(-1032197736))
                                        goto(Label_0626)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(128)), ldc:int(0))) {
                                        goto(Label_0473)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4194304)), ldc:int(0))) {
                                        return:int(and:int(ldc:int(1253), ldc:int(-14054)))
                                    }
                                    
                                    loopcontinue()
                                }
                                
                                Label_1208:
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_2075)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1691352966))
                                    goto(Label_1939)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1851516502))
                                    goto(Label_1714)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_1550)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(331701171))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                        goto(Label_0976)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(268435456)), ldc:int(0))) {
                                        goto(Label_0801)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(-2041265329))
                                        goto(Label_0626)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(16777216)), ldc:int(0))) {
                                        goto(Label_0473)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1531905006))
                                }
                                
                                Label_1350:
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_2075)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(159337891))
                                    goto(Label_1939)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_1714)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-757591291))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(512)), ldc:int(0))) {
                                        goto(Label_1208)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(16777216)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(-190482332))
                                        goto(Label_0976)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(16384)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(379091127))
                                        goto(Label_0801)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(624893527))
                                        goto(Label_0626)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(582575718))
                                        goto(Label_0473)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(1334813552))
                                        loopcontinue()
                                    }
                                    
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-1612166164))
                                    var_11_47C = invokevirtual:int(Random::nextInt, p1:Random, xor:int(ldc:int(3106), ldc:int(3104)))
                                    goto(Label_2335)
                                }
                                
                                Label_1550:
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(480381116))
                                    goto(Label_2075)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4096)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1611746201))
                                    goto(Label_1939)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4096)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(2)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(479831017))
                                        goto(Label_1350)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(16777216)), ldc:int(0))) {
                                        goto(Label_1208)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(512)), ldc:int(0))) {
                                        goto(Label_0976)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(16777216)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(-1517230199))
                                        goto(Label_0801)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(-173567928))
                                        goto(Label_0626)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(128)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(1785516225))
                                        goto(Label_0473)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4194304)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_6_950 = and:int(var_6_950:int, ldc:int(2098217933))
                                }
                                
                                Label_1714:
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1328449930))
                                    goto(Label_2075)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(2055461301))
                                        goto(Label_1550)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(64)), ldc:int(0))) {
                                        goto(Label_1350)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_1208)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                        goto(Label_0976)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0801)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(16777216)), ldc:int(0))) {
                                        goto(Label_0626)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_0473)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(925237206))
                                        var_11_47C = and:int(ldc:int(17497), ldc:int(14595))
                                        goto(Label_2335)
                                    }
                                    
                                    loopcontinue()
                                }
                                
                                Label_1939:
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(512)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(128)), ldc:int(0))) {
                                        goto(Label_1714)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4096)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(-2106437683))
                                        goto(Label_1550)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_1350)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(1794071773))
                                        goto(Label_1208)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_6_950 = and:int(var_6_950:int, ldc:int(1119227279))
                                        goto(Label_0976)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(268435456)), ldc:int(0))) {
                                        goto(Label_0801)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4194304)), ldc:int(0))) {
                                        goto(Label_0626)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(16777216)), ldc:int(0))) {
                                        goto(Label_0473)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1561589757))
                                    
                                    if (logicalnot:boolean(p4:boolean)) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_2075:
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(2)), ldc:int(0))) {
                                    goto(Label_1939)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(743760387))
                                    goto(Label_1714)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_1550)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-800884476))
                                    goto(Label_1350)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(694694879))
                                    goto(Label_1208)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_0976)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(64)), ldc:int(0))) {
                                    goto(Label_0801)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-288470985))
                                    goto(Label_0626)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(128)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(237377246))
                                    goto(Label_0473)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-1972625088))
                                    loopcontinue()
                                }
                                
                                var_6_950 = and:int(var_6_950:int, ldc:int(-1317179428))
                                stack_8DC_0 = xor:int(ldc:int(-31738), ldc:int(-31737))
                                goto(Label_2260)
                                Label_1150:
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4194304)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1006929808))
                                    goto(Label_2340)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_2270)
                                }
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(256)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1398974437))
                                    goto(Label_2335)
                                }
                                
                                Label_1859:
                                
                                if (cmpne:boolean(and:int(var_6_950:int, ldc:int(131072)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(935383251))
                                    goto(Label_2340)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(16777216)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(1678750208))
                                    goto(Label_2270)
                                }
                                
                                if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                    var_6_950 = and:int(var_6_950:int, ldc:int(-212716413))
                                    goto(Label_1150)
                                }
                                
                                var_6_950 = and:int(var_6_950:int, ldc:int(1398080502))
                                goto(Label_2335)
                            }
                            
                            Label_2253:
                            stack_8DC_0 = and:int(ldc:int(16571), ldc:int(-18684))
                            Label_2260:
                            var_6_950 = and:int(var_6_950:int, ldc:int(-74407948))
                            var_11_47C = stack_8DC_0:int
                            Label_2270:
                            
                            if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4096)), ldc:int(0))) {
                                goto(Label_2340)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_950:int, ldc:int(4096)), ldc:int(0))) {
                                goto(Label_1859)
                            }
                            
                            if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(512)), ldc:int(0))) {
                                var_6_950 = and:int(var_6_950:int, ldc:int(1691124150))
                                goto(Label_1150)
                            }
                            
                            var_6_950 = and:int(var_6_950:int, ldc:int(422838263))
                            goto(Label_2335)
                            Label_2335:
                            
                            if (cmple:boolean(var_11_47C:int, ldc:int(0))) {
                                stack_976_0 = and:int(ldc:int(2105), ldc:int(-2106))
                                return:int(stack_976_0:int)
                            }
                            
                            Label_2340:
                            
                            if (cmpeq:boolean(and:int(var_6_950:int, ldc:int(4)), ldc:int(0))) {
                                var_6_950 = and:int(var_6_950:int, ldc:int(1828055382))
                                goto(Label_2270)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_1859)
                            }
                            
                            if (cmpne:boolean(and:int(var_6_950:int, ldc:int(536870912)), ldc:int(0))) {
                                goto(Label_1150)
                            }
                            
                            var_6_950 = and:int(var_6_950:int, ldc:int(897316820))
                            stack_976_0 = invokevirtual:int(Random::nextInt, p1:Random, add:int(var_11_47C:int, xor:int(ldc:int(3105), ldc:int(3104))))
                            return:int(stack_976_0:int)
                        }
                    } while (cmpne:boolean(and:int(var_6_F0:int, ldc:int(4096)), ldc:int(0)))
                    
                    var_6_F0 = and:int(var_6_F0:int, ldc:int(-542910475))
                    stack_10F_0 = xor:int(ldc:int(16512), ldc:int(16513))
                    goto(Label_0263)
                }
            } while (cmpne:boolean(and:int(var_6_9C:int, ldc:int(4194304)), ldc:int(0)))
            
            var_6_9C = and:int(var_6_9C:int, ldc:int(1909278700))
            stack_BB_0 = and:int(ldc:int(4497), ldc:int(8193))
            goto(Label_0179)
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub18d\u74b1\u7049\uc9f6\ud217\u760c() {
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
            return:boolean(getfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua61f\uc29a\u67d0\u6c52\ub7dc\ua3b4, this:\ub83f\uc910\u4c2b\u446c\u71ae))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u7043\u3e2a\u0c95\uc229\u6c56\u8308(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0) {
        var_2_61 : int
        var_4_17F : \ud158\u8308\u76bc\u0a06\ud36e
        var_5_18A : Iterator<UUID>
        
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
            var_2_61 = and:int(ldc:int(824106920), ldc:int(-237085991))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(-10825), ldc:int(10824))), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u62da\u92ee\u62da\u3dd3\u4bc8\u92ff, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\uae87\u5654\u88c5\u5245\u7bad\u3776, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(19485), ldc:int(8323))), getfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ub7dc\uae5d\ua3b4\uc246\uc910\u8753, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\uae87\u5654\u88c5\u5245\u7bad\u3776, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(834), ldc:int(16518))), getfield:boolean(\ub83f\uc910\u4c2b\u446c\u71ae::\ua61f\uc29a\u67d0\u6c52\ub7dc\ua3b4, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u7e3f\ub113\u12b2\ubb2b\u64f2\u7af6, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(16519), ldc:int(16516))), getfield:long(\ub83f\uc910\u4c2b\u446c\u71ae::\u74b1\u4179\ua3b4\uc87f\u385b\u9255, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(-31359), ldc:int(-31355))), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\uc84e\u8bb0\u7043\u61a4\u6d99\u3e2a, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(17429), ldc:int(17424))), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6d69\u6c56\u836c\u98a4\u34df\u40a9, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(25606), ldc:int(4103))), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u6b5f\u1187\u7873\u3e75\u759a\u36d3, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(17415), ldc:int(2279))), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u71ae\u927d\uf995\u9937\u71f1\u7049, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u965f\u71f1\ud7e8\u76bc\ucb79\u6ec6, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(8396), ldc:int(22571))), getfield:float(\ub83f\uc910\u4c2b\u446c\u71ae::\u960f\u7c6b\u4f4a\u3776\u3a62\ubefe, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(2542), ldc:int(541))), getfield:int(\ub83f\uc910\u4c2b\u446c\u71ae::\ub113\u6d99\u7006\uc31c\u965f\ub70c, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u385b\uafe7\u8d90\u8308\u12cb\u7049, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(557), ldc:int(29))), invokevirtual:String(\u527a\u5db4\u4179\u6435\uafe7::\ub70c\uc4d2\u56bd\ucef1\u8350\u6d99, getfield:\u527a\u5db4\u4179\u6435\uafe7(\ub83f\uc910\u4c2b\u446c\u71ae::\uff55\uc3e3\u9a18\u6b0d\u183a\u88c5, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(2569), ldc:int(4505))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(271), ldc:int(12442))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u4ab3\u873d\ub113\ub113\ub70c\u6fb0, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(18440), ldc:int(18435))), invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
            var_4_17F = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
            var_5_18A = invokeinterface:Iterator<UUID>(Set<UUID>::iterator, getfield:Set<UUID>(\ub83f\uc910\u4c2b\u446c\u71ae::\u4e72\u8709\u3c25\u51fa\u4d85\u6b0d, this:\ub83f\uc910\u4c2b\u446c\u71ae))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(630897256))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_18A:Iterator<UUID>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:boolean(AbstractList<\ucb79\uf995\u3d64\u64f2\ucef1>::add, var_4_17F:AbstractList<\ucb79\uf995\u3d64\u64f2\ucef1>, invokestatic:\ucb79\uf995\u3d64\u64f2\ucef1(\u946b\u92ee\u6fb0\ua6bd\ubefe::\ud158\u3d64\ubf56\u36d3\ube23\u8308, checkcast:UUID(java.util.UUID.class, invokeinterface:UUID(Iterator<UUID>::next, var_5_18A:Iterator<UUID>))))
            }
            
            invokevirtual:\u93a2\u97b7\u647c\ud36e\u64ab(\uc31c\uc87f\uc246\u3776\ub7dc::\u0800\u4179\ub8be\u5654\uc229\u5fe1, p0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(650), ldc:int(644))), var_4_17F:\ud158\u8308\u76bc\u0a06\ud36e[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
            return:\uc31c\uc87f\uc246\u3776\ub7dc(p0:\uc31c\uc87f\uc246\u3776\ub7dc)
        }
        
        goto(Label_0006)
    }
    
    public int \u4975\u47c2\uc84e\u392e\u5140\ub19c(\u6435\ub8be\u718f\u6b0d\u67e9.\u8753\u0800\u4f4a\u4975\u64ab\u4c04 p0) {
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
        
        switch (loadelement:int(getstatic:int[](\ud7e8\uc2bd\uc238\ubb2b\u7330::\u69d9\u873d\u99f7\u965f\u7d52\ua068), invokevirtual:int(Enum<E>::ordinal, p0:\u8753\u0800\u4f4a\u4975\u64ab\u4c04[expected:Enum<\u8753\u0800\u4f4a\u4975\u64ab\u4c04>]))) {
            case 1:
                return:int(xor:int(ldc:int(-32472), ldc:int(-32469)))
            
            case 2:
                return:int(and:int(ldc:int(18901), ldc:int(47)))
            
            case 3:
                return:int(ldc:int(7))
            
            default:
                return:int(and:int(ldc:int(-15929), ldc:int(15928)))
        }
    }
    
    public float \u67e9\u6ec6\u6435\u3d4b\u4bc8\ufcaf() {
        var_1_149 : int
        var_3_66 : int
        stack_17C_0 : float [generated]
        
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
        var_1_149 = and:int(ldc:int(-227276913), ldc:int(1970193860))
        var_3_66 = invokevirtual:int(\ub83f\uc910\u4c2b\u446c\u71ae::\u4d85\u3776\u4f4a\u3e75\u8d98\u873d, this:\ub83f\uc910\u4c2b\u446c\u71ae)
        
        if (cmpne:boolean(var_3_66:int, and:int(ldc:int(1346), ldc:int(12290)))) {
            loop {
                if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0273)
                }
                
                if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_149 = and:int(var_1_149:int, ldc:int(1885440076))
                    goto(Label_0232)
                }
                
                if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(4096)), ldc:int(0))) {
                    var_1_149 = and:int(var_1_149:int, ldc:int(1634817927))
                    
                    if (cmpeq:boolean(var_3_66:int, xor:int(ldc:int(8293), ldc:int(8294)))) {
                        return:float(ldc:float(0.25f))
                    }
                }
                
                Label_0164:
                
                if (cmpne:boolean(and:int(var_1_149:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_149 = and:int(var_1_149:int, ldc:int(1592380671))
                    goto(Label_0273)
                }
                
                if (cmpne:boolean(and:int(var_1_149:int, ldc:int(16384)), ldc:int(0))) {
                    var_1_149 = and:int(var_1_149:int, ldc:int(884298203))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(4)), ldc:int(0))) {
                        var_1_149 = and:int(var_1_149:int, ldc:int(914824919))
                        loopcontinue()
                    }
                    
                    var_1_149 = and:int(var_1_149:int, ldc:int(-67479714))
                    
                    if (cmpeq:boolean(var_3_66:int, xor:int(ldc:int(-32572), ldc:int(-32576)))) {
                        return:float(ldc:float(0.5f))
                    }
                }
                
                Label_0232:
                
                if (cmpne:boolean(and:int(var_1_149:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0164)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_149:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_149 = and:int(var_1_149:int, ldc:int(2121909629))
                    
                    if (cmpeq:boolean(var_3_66:int, and:int(ldc:int(2277), ldc:int(1029)))) {
                        stack_17C_0 = ldc:float(0.75f)
                        looporswitchbreak()
                    }
                }
                
                Label_0273:
                
                if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_149 = and:int(var_1_149:int, ldc:int(-852347203))
                    goto(Label_0232)
                }
                
                if (cmpeq:boolean(and:int(var_1_149:int, ldc:int(1024)), ldc:int(0))) {
                    var_1_149 = and:int(var_1_149:int, ldc:int(1472576585))
                    goto(Label_0164)
                }
                
                if (cmpne:boolean(and:int(var_1_149:int, ldc:int(4194304)), ldc:int(0))) {
                    var_1_149 = and:int(var_1_149:int, ldc:int(-43319826))
                    stack_17C_0 = ldc:float(0.0f)
                    looporswitchbreak()
                }
                
                var_1_149 = and:int(var_1_149:int, ldc:int(258375464))
            }
            
            return:float(stack_17C_0:float)
        }
        
        return:float(ldc:float(0.1f))
    }
    
    public void \ufcaf\u8640\u120d\ua068\u2dcc\ub171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            invokeinterface:boolean(Set<UUID>::add, getfield:Set<UUID>(\ub83f\uc910\u4c2b\u446c\u71ae::\u4e72\u8709\u3c25\u51fa\u4d85\u6b0d, this:\ub83f\uc910\u4c2b\u446c\u71ae), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Set lambda$\u67d0\uc31c\u59ec\u88c5\u8413\u64f2$2(java.lang.Integer p0) {
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
            return:Set(invokestatic:HashSet[expected:Set](Sets::newHashSet))
        }
        
        goto(Label_0006)
    }
    
    private double lambda$\u7043\u51fa\ud217\u6d69\u88c5\ube23$1(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:double(invokevirtual:double(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8d98\u64f2\u97b7\ua6bd\uc229\u51fa, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ub83f\uc910\u4c2b\u446c\u71ae::\u6c56\ub6ab\u4492\u183a\uf9c5\u59ec, this:\ub83f\uc910\u4c2b\u446c\u71ae)))
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u71f1\u59ec\uc2e8\u97e6\uae5d\u3e75$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
        var_2_61 : int
        var_4_66 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        stack_A4_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(1931697099), ldc:int(1783589589))
            var_4_66 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            
            if (logicaland:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ube23\u67d0\u64f2\u839e\u76bc]), cmpeq:boolean(invokevirtual:\ub83f\uc910\u4c2b\u446c\u71ae(\ube23\uc238\u5140\u4cd9\u8aa5::\u40a9\u9a18\uc246\u6bb9\u839e\u983f, getfield:\ube23\uc238\u5140\u4cd9\u8aa5(\ub83f\uc910\u4c2b\u446c\u71ae::\u416d\u6c56\ud217\u62da\u6cfe\u8cae, this:\ub83f\uc910\u4c2b\u446c\u71ae), var_4_66:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), this:\ub83f\uc910\u4c2b\u446c\u71ae))) {
                stack_A4_0 = and:int(ldc:int(20741), ldc:int(9))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-585700229))
                stack_A4_0 = and:int(ldc:int(476), ldc:int(-989))
            }
            
            return:boolean(stack_A4_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_468 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_47B_0 : byte[] [generated]
        stack_50A_0 : byte[] [generated]
        stack_545_0 : byte[] [generated]
        stack_59B_0 : byte[] [generated]
        var_4_453 : int
        var_3_458 : byte[]
        var_5_459 : int
        var_0_495 : int
        expr_47B : byte [generated]
        stack_4C4_2 : byte [generated]
        stack_498_0 : byte [generated]
        expr_9E : int [generated]
        var_2_D5 : byte[]
        expr_D9 : int [generated]
        var_3_533 : byte[]
        var_5_534 : int
        expr_109 : int [generated]
        var_3_589 : byte[]
        var_5_58A : int
        expr_59B : byte [generated]
        var_3_142 : String
        expr_14A : String[] [generated]
        expr_154 : String[] [generated]
        var_3_3CD : String[]
        
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
        var_0_468 = and:int(ldc:int(1119471742), ldc:int(1942084223))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D5_0 = stack_D7_0 = stack_107_0 = stack_109_0 = stack_136_0 = stack_47B_0 = stack_50A_0 = stack_545_0 = stack_59B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("T5KSkMCA+XpA/w45wkr9QfQGg71/twoHfMSDRT06efZ2wHk9/4cLB8rHA4F8gIF8xvX/QMAAQkTAerwBO4WCA8CARPb9fQKEdstGRkF+xD2/QrxAiIP3P4SB+H/FvLq8xn6D/IcAOoJ9BHkAxn6EPAYAQsV8xDhEPAAERMK8gjuAdEJGf0V8QwT+AXw5xX78Q/+JP4JCOrNEwEF+AdH7wX7zA0L+A0IRAHrBPD7BfUVBxjz/Qy4FOsY8PdH7wX70RD7/gb7RO8JDsgU6xjw90fvBfvREPv9/sU09vwDBUcDEPsRDrgU6xjw90fvBfvREPv9/sdA+/kHB0L9+xb4EPnxGOsZ9/8Y5xX5yBTrGPD3R+8F+9EQ+/3+y0jx+Q0XRPTCw7axqLQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_453 = expr_6E:int
        var_3_458 = newarray:byte[](byte.class, expr_6E:int)
        var_5_459 = expr_6E:int
        Label_1115:
        
        while (cmpne:boolean(and:int(var_0_468:int, ldc:int(65536)), ldc:int(0))) {
            var_0_495 = and:int(var_0_468:int, ldc:int(-499516418))
            var_5_459 = add:int(var_5_459:int, ldc:int(-1))
            expr_47B = stack_4C4_2 = loadelement(stack_47B_0, var_5_459)
            
            if (cmplt:boolean(add:int(add:int(var_5_459:int, ldc:int(6)), neg:int(var_4_453:int)), ldc:int(0))) {
                stack_4C4_2 = stack_498_0 = add:byte(expr_47B:byte, loadelement:byte(var_3_458:byte[], add:int(var_5_459:int, ldc:int(6))))
                goto(Label_1192)
            }
            
            Label_1160:
            
            if (cmpne:boolean(and:int(var_0_495:int, ldc:int(32768)), ldc:int(0))) {
                var_0_495 = and:int(var_0_495:int, ldc:int(-95294369))
                stack_4C4_2 = stack_498_0 = add:byte(expr_47B:byte, ldc:byte(6))
            }
            
            Label_1192:
            
            if (cmpeq:boolean(and:int(var_0_495:int, ldc:int(2)), ldc:int(0))) {
                var_0_495 = and:int(var_0_495:int, ldc:int(1397306816))
                goto(Label_1160)
            }
            
            var_0_468 = and:int(var_0_495:int, ldc:int(1719532767))
            storeelement:byte(var_3_458:byte[], var_5_459:int, stack_4C4_2:byte)
            
            if (cmpne:boolean(var_5_459:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_107_0 = stack_109_0 = stack_136_0 = stack_47B_0 = stack_50A_0 = stack_545_0 = stack_59B_0 = var_3_458:byte[]
            goto(Label_0115)
        }
        
        var_0_468 = and:int(var_0_468:int, ldc:int(54418785))
        Label_1258:
        
        while (cmpeq:boolean(and:int(var_0_468:int, ldc:int(131072)), ldc:int(0))) {
            var_0_468 = and:int(var_0_468:int, ldc:int(-419180802))
            var_5_459 = add:int(var_5_459:int, ldc:int(-1))
            storeelement:byte(var_3_458:byte[], var_5_459:int, xor:byte(loadelement:byte(stack_50A_0:byte[], var_5_459:int), ldc:byte(63)))
            
            if (cmpne:boolean(var_5_459:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_107_0 = stack_109_0 = stack_136_0 = stack_47B_0 = stack_50A_0 = stack_545_0 = stack_59B_0 = var_3_458:byte[]
            goto(Label_0163)
        }
        
        var_0_468 = and:int(var_0_468:int, ldc:int(-1429502829))
        goto(Label_1115)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_468:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_468:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_468:int, ldc:int(65536)), ldc:int(0))) {
            var_0_468 = and:int(var_0_468:int, ldc:int(1159414433))
        }
        else {
            var_0_468 = and:int(var_0_468:int, ldc:int(-742263170))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_453 = expr_9E:int
                var_3_458 = newarray:byte[](byte.class, expr_9E:int)
                var_5_459 = expr_9E:int
                goto(Label_1258)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_468:int, ldc:int(8192)), ldc:int(0))) {
            var_0_468 = and:int(var_0_468:int, ldc:int(-1793059856))
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_468:int, ldc:int(131072)), ldc:int(0))) {
            var_0_468 = and:int(var_0_468:int, ldc:int(-1115521630))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_468:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_468 = and:int(var_0_468:int, ldc:int(-693767970))
            var_2_D5 = stack_D5_0:byte[]
            expr_D9 = add:int(arraylength:int(stack_D7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_3_533 = newarray:byte[](byte.class, expr_D9:int)
                var_5_534 = expr_D9:int
                
                loop {
                    var_0_468 = and:int(var_0_468:int, ldc:int(-290992130))
                    var_5_534 = add:int(var_5_534:int, ldc:int(-1))
                    storeelement:byte(var_3_533:byte[], var_5_534:int, add:int(shl:int(loadelement:byte(stack_545_0:byte[], var_5_534:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_D5:byte[], add:int(var_5_534:int, and:int(ldc:int(25409), ldc:int(1033)))), ldc:int(2)), and:int(ldc:int(16447), ldc:int(1471)))))
                    
                    if (cmpne:boolean(var_5_534:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_107_0 = stack_109_0 = stack_136_0 = stack_47B_0 = stack_50A_0 = stack_545_0 = stack_59B_0 = var_3_533:byte[]
            }
        }
        
        Label_0222:
        
        if (cmpeq:boolean(and:int(var_0_468:int, ldc:int(16)), ldc:int(0))) {
            var_0_468 = and:int(var_0_468:int, ldc:int(1116211171))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_468:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_468:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_468 = and:int(var_0_468:int, ldc:int(1133887839))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_3_589 = newarray:byte[](byte.class, expr_109:int)
                var_5_58A = expr_109:int
                
                loop {
                    var_0_468 = and:int(var_0_468:int, ldc:int(-888406017))
                    var_5_58A = add:int(var_5_58A:int, ldc:int(-1))
                    expr_59B = loadelement:byte(stack_59B_0:byte[], var_5_58A:int)
                    storeelement:byte(var_3_589:byte[], var_5_58A:int, add:int(or:int(and:int(shl:int(expr_59B:byte, xor:int(ldc:int(6659), ldc:int(6663))), ldc:int(-16)), and:int(shr:int(expr_59B:byte[expected:int], and:int(ldc:int(12), ldc:int(102))), ldc:int(15))), ldc:int(61)))
                    
                    if (cmpne:boolean(var_5_58A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_107_0 = stack_109_0 = stack_136_0 = stack_47B_0 = stack_50A_0 = stack_545_0 = stack_59B_0 = var_3_589:byte[]
            }
        }
        
        Label_0270:
        
        if (cmpne:boolean(and:int(var_0_468:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_468:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_468:int, ldc:int(64)), ldc:int(0))) {
            var_0_468 = and:int(var_0_468:int, ldc:int(-1279563621))
            goto(Label_0115)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_14A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3799), ldc:int(12351)))
        expr_154 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8200), ldc:int(8223)))
        storeelement:String(expr_154:String[], and:int(ldc:int(16751), ldc:int(14367)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-7868), ldc:int(7345)), xor:int(ldc:int(8712), ldc:int(8715))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(1029), ldc:int(1031)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-30711), ldc:int(-30710)), and:int(ldc:int(20617), ldc:int(265))))
        storeelement:String(expr_154:String[], and:int(ldc:int(260), ldc:int(5639)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(59), ldc:int(4617)), xor:int(ldc:int(1172), ldc:int(1153))))
        storeelement:String(expr_154:String[], and:int(ldc:int(9367), ldc:int(16945)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1109), ldc:int(181)), xor:int(ldc:int(21516), ldc:int(21551))))
        storeelement:String(expr_154:String[], and:int(ldc:int(9), ldc:int(793)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(25117), ldc:int(25150)), and:int(ldc:int(28967), ldc:int(1269))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-30718), ldc:int(-30712)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(2150), ldc:int(2115)), and:int(ldc:int(807), ldc:int(28719))))
        storeelement:String(expr_154:String[], and:int(ldc:int(16523), ldc:int(523)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(2061), ldc:int(2090)), xor:int(ldc:int(-16378), ldc:int(-16337))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-16363), ldc:int(-16368)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(2105), ldc:int(4201)), xor:int(ldc:int(4188), ldc:int(4202))))
        storeelement:String(expr_154:String[], and:int(ldc:int(3086), ldc:int(16687)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(6838), ldc:int(55)), and:int(ldc:int(76), ldc:int(2664))))
        storeelement:String(expr_154:String[], and:int(ldc:int(12334), ldc:int(-14383)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(12356), ldc:int(12300)), and:int(ldc:int(202), ldc:int(4171))))
        storeelement:String(expr_154:String[], and:int(ldc:int(8716), ldc:int(3372)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(90), ldc:int(16)), and:int(ldc:int(12375), ldc:int(3699))))
        storeelement:String(expr_154:String[], and:int(ldc:int(8466), ldc:int(16947)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(20091), ldc:int(8531)), xor:int(ldc:int(2674), ldc:int(2601))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(133), ldc:int(130)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(23135), ldc:int(8283)), and:int(ldc:int(1133), ldc:int(10728))))
        storeelement:String(expr_154:String[], and:int(ldc:int(10246), ldc:int(17030)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(120), ldc:int(26734)), xor:int(ldc:int(-24055), ldc:int(-23939))))
        storeelement:String(expr_154:String[], and:int(ldc:int(147), ldc:int(809)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(1541), ldc:int(1649)), and:int(ldc:int(10363), ldc:int(895))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(8199), ldc:int(8202)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(4991), ldc:int(123)), xor:int(ldc:int(63), ldc:int(190))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(4224), ldc:int(4227)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(1041), ldc:int(1168)), xor:int(ldc:int(339), ldc:int(479))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(1189), ldc:int(1197)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(8356), ldc:int(8232)), and:int(ldc:int(4311), ldc:int(8855))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-32743), ldc:int(-32758)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(2770), ldc:int(2629)), xor:int(ldc:int(8338), ldc:int(8231))))
        storeelement:String(expr_14A:String[], xor:int(ldc:int(16516), ldc:int(16528)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(509), ldc:int(30389)), xor:int(ldc:int(-30578), ldc:int(-30649))))
        storeelement:String(expr_14A:String[], xor:int(ldc:int(8213), ldc:int(8195)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(3209), ldc:int(3136)), xor:int(ldc:int(5), ldc:int(225))))
        storeelement:String(expr_154:String[], and:int(ldc:int(2078), ldc:int(1136)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(20610), ldc:int(20582)), xor:int(ldc:int(658), ldc:int(920))))
        storeelement:String(expr_14A:String[], and:int(ldc:int(16885), ldc:int(8725)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(2859), ldc:int(266)), xor:int(ldc:int(24578), ldc:int(24868))))
        putstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1, expr_154:String[])
        var_3_3CD = expr_14A:String[]
        putstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\ud12e\u7049\uc84e\u9937\u8bb0\u0c95, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3CD:String[], and:int(ldc:int(4180), ldc:int(16534)))))
        putstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\u7d52\uc2e8\u74b1\u3711\u3dd3\u6b0d, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3CD:String[], xor:int(ldc:int(6169), ldc:int(6156)))))
        putstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\u8413\u983f\u93a2\u72f1\uf94d\u8308, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3CD:String[], and:int(ldc:int(2743), ldc:int(30)))))
        putstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\u4e72\uc2e8\uc31c\u8640\u7bad\u7330, invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::append, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(ITextComponent::deepCopy, getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\ud12e\u7049\uc84e\u9937\u8bb0\u0c95)), loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), xor:int(ldc:int(-32512), ldc:int(-32497)))), getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\u7d52\uc2e8\u74b1\u3711\u3dd3\u6b0d)))
        putstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\u983f\u7e3f\u960f\u8709\ub70c\u600f, invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::append, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(ITextComponent::deepCopy, getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\ud12e\u7049\uc84e\u9937\u8bb0\u0c95)), loadelement:String(getstatic:String[](\ub83f\uc910\u4c2b\u446c\u71ae::\uf9c5\u120d\u16f6\u64f2\ub171\u71f1), and:int(ldc:int(8287), ldc:int(17167)))), getstatic:ITextComponent(\ub83f\uc910\u4c2b\u446c\u71ae::\u8413\u983f\u93a2\u72f1\uf94d\u8308)))
    }
    
    public void \ubefe\u7873\u4c04\u7049\u8308\u6d69(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6E7 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6F2 : int
        
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
        var_3_6E7 = and:int(ldc:int(-70329787), ldc:int(-1211440209))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub83f\uc910\u4c2b\u446c\u71ae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-169940148))
            var_5_81 = and:int(ldc:int(-17748), ldc:int(17745))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(28165), ldc:int(-32518)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6E7:int, ldc:int(435092005))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(2625), ldc:int(1059)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(2603), ldc:int(257)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6E7 = and:int(var_3_D1:int, ldc:int(-1056139))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-32640), ldc:int(-32639)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(616042433))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1684007441))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1704412890))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1474195358))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1944769478))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1727802986))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1584673224))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1666335425))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1469054445))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1038675052))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1780813988))
                            var_11_E2 = and:int(ldc:int(-5181), ldc:int(5180))
                            goto(Label_1643)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1879743656))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1231475339))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1727002342))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(249692475))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-829809128))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1180685685))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1977348783))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(2029198638))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-698233566))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1304722608))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1235446774))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(370274455))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(545200818))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(715873259))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1713636393))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1658797968))
                        goto(Label_1654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-518538053))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-2022731396))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-649822664))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-2015326741))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-33302741))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(354821877))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-136383601))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(21), ldc:int(4161))
                                goto(Label_1209)
                            }
                        }
                    }
                    
                    Label_1031:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1163513136))
                        goto(Label_1654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(379233780))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-956950801))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1437867390))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1118960697))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1071867907))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1611675705))
                        var_11_E2 = and:int(ldc:int(14369), ldc:int(-14626))
                    }
                    
                    Label_1209:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1618302318))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1332327934))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1434990441))
                            goto(Label_1031)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1815450902))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(298503948))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1497)
                            }
                        }
                    }
                    
                    Label_1334:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1654)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1902296923))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1120725096))
                            goto(Label_1209)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-364966419))
                            goto(Label_1031)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1841346454))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(838260645))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(2056848090))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(434971080))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1244987508))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1643)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1497:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1393323147))
                        goto(Label_1654)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1158184198))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1560603643))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1979838314))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(362208817))
                        loopcontinue()
                    }
                    
                    var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-101718339))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1643:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6F2 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1654:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1176803668))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1281430159))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1373732381))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1516984989))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(2046553893))
                        var_17_6F2 = add:int(var_16_110:int, xor:int(ldc:int(8268), ldc:int(8269)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6E7 = and:int(var_3_6E7:int, ldc:int(939188143))
                
                if (cmple:boolean(var_5_81 = var_17_6F2:int, sub:int(var_6_88:int, and:int(ldc:int(27077), ldc:int(4147))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
