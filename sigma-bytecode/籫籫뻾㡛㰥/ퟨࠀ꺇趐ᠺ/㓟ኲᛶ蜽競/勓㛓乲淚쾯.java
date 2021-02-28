public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u52d3\u36d3\u4e72\uf94d\ucfaf {
    public void \u52d3\u36d3\u4e72\uf94d\ucfaf(java.io.File p0, java.io.File p1, boolean p2) {
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
            invokespecial:\u52d3\u36d3\u4e72\uf94d\ucfaf(\u52d3\u36d3\u4e72\uf94d\ucfaf::<init>, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, invokevirtual:Path(File::toPath, p0:File), invokevirtual:Path(File::toPath, p1:File), getstatic:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a(\u0b8e\uc2e8\u98a4\u7e3f\u8c8a::\u927d\u624e\u4975\u4e72\u8bb0\uc84e), p2:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u52d3\u36d3\u4e72\uf94d\ucfaf(java.nio.file.Path p0, java.nio.file.Path p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u0b8e\uc2e8\u98a4\u7e3f\u8c8a p2, boolean p3) {
        expr_E2 : OpenOption[] [generated]
        expr_14F : OpenOption[] [generated]
        var_7_1BC : int
        var_8_1E1 : long
        var_10_1EA : int
        var_11_22F : int
        var_12_249 : int
        var_13_250 : int
        
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
        invokespecial:Object(Object::<init>, this:\u52d3\u36d3\u4e72\uf94d\ucfaf)
        putfield:ByteBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u76bc\u64ab\u61a4\u839e\u7043\u4ab3, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, invokestatic:ByteBuffer(ByteBuffer::allocateDirect, xor:int(ldc:int(15028), ldc:int(6836))))
        putfield:\ub70c\u7bad\u1833\uc87f\u59ec(\u52d3\u36d3\u4e72\uf94d\ucfaf::\ube23\u8258\ua562\ucef1\u3504\u760c, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, initobject:\ub70c\u7bad\u1833\uc87f\u59ec(\ub70c\u7bad\u1833\uc87f\u59ec::<init>))
        putfield:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u4c2b\u9255\u6fb0\ubefe\u5f50\u47c2, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p2:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a)
        
        if (invokestatic:boolean(Files::isDirectory, p1:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-15076), ldc:int(14883))))) {
            putfield:Path(\u52d3\u36d3\u4e72\uf94d\ucfaf::\ub171\ub7dc\ub7dc\u7af6\uae5d\u59ec, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p1:Path)
            invokevirtual:Buffer(Buffer::limit, putfield:IntBuffer[expected:Buffer](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u12b2\uc31c\u4daf\uff55\ub6ab\u7006, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, invokevirtual:IntBuffer(ByteBuffer::asIntBuffer, getfield:ByteBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u76bc\u64ab\u61a4\u839e\u7043\u4ab3, this:\u52d3\u36d3\u4e72\uf94d\ucfaf))), xor:int(ldc:int(25590), ldc:int(26614)))
            invokevirtual:Buffer(Buffer::position, getfield:ByteBuffer[expected:Buffer](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u76bc\u64ab\u61a4\u839e\u7043\u4ab3, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), and:int(ldc:int(5184), ldc:int(12554)))
            putfield:IntBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\ubded\u3504\u8350\u6435\u6cfe\u960f, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, invokevirtual:IntBuffer(ByteBuffer::asIntBuffer, getfield:ByteBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u76bc\u64ab\u61a4\u839e\u7043\u4ab3, this:\u52d3\u36d3\u4e72\uf94d\ucfaf)))
            
            if (logicalnot:boolean(p3:boolean)) {
                expr_E2 = newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(1315), ldc:int(25219)))
                storeelement:OpenOption(expr_E2:OpenOption[], and:int(ldc:int(11168), ldc:int(-11169)), getstatic:StandardOpenOption[expected:OpenOption](StandardOpenOption::CREATE))
                storeelement:OpenOption(expr_E2:OpenOption[], xor:int(ldc:int(9488), ldc:int(9489)), getstatic:StandardOpenOption[expected:OpenOption](StandardOpenOption::READ))
                storeelement:OpenOption(expr_E2:OpenOption[], xor:int(ldc:int(2629), ldc:int(2631)), getstatic:StandardOpenOption[expected:OpenOption](StandardOpenOption::WRITE))
                putfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, invokestatic:FileChannel(FileChannel::open, p0:Path, expr_E2:OpenOption[]))
            }
            else {
                expr_14F = newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(9550), ldc:int(165)))
                storeelement:OpenOption(expr_14F:OpenOption[], and:int(ldc:int(15888), ldc:int(-15929)), getstatic:StandardOpenOption[expected:OpenOption](StandardOpenOption::CREATE))
                storeelement:OpenOption(expr_14F:OpenOption[], xor:int(ldc:int(160), ldc:int(161)), getstatic:StandardOpenOption[expected:OpenOption](StandardOpenOption::READ))
                storeelement:OpenOption(expr_14F:OpenOption[], xor:int(ldc:int(2305), ldc:int(2307)), getstatic:StandardOpenOption[expected:OpenOption](StandardOpenOption::WRITE))
                storeelement:OpenOption(expr_14F:OpenOption[], and:int(ldc:int(3587), ldc:int(24947)), getstatic:StandardOpenOption[expected:OpenOption](StandardOpenOption::DSYNC))
                putfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, invokestatic:FileChannel(FileChannel::open, p0:Path, expr_14F:OpenOption[]))
            }
            
            invokevirtual:void(\ub70c\u7bad\u1833\uc87f\u59ec::\uc238\u8709\u67e9\u5bc4\ub83f\u59ec, getfield:\ub70c\u7bad\u1833\uc87f\u59ec(\u52d3\u36d3\u4e72\uf94d\ucfaf::\ube23\u8258\ua562\ucef1\u3504\u760c, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), and:int(ldc:int(23760), ldc:int(-31959)), xor:int(ldc:int(20481), ldc:int(20483)))
            invokevirtual:Buffer(Buffer::position, getfield:ByteBuffer[expected:Buffer](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u76bc\u64ab\u61a4\u839e\u7043\u4ab3, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), and:int(ldc:int(-25917), ldc:int(24876)))
            var_7_1BC = invokevirtual:int(FileChannel::read, getfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), getfield:ByteBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u76bc\u64ab\u61a4\u839e\u7043\u4ab3, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), ldc:long(0L))
            
            if (cmpne:boolean(var_7_1BC:int, ldc:int(-1))) {
                if (cmpne:boolean(var_7_1BC:int, and:int(ldc:int(11558), ldc:int(25097)))) {
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), and:int(ldc:int(18459), ldc:int(1633))), p0:Path[expected:Object], invokestatic:Integer(Integer::valueOf, var_7_1BC:int))
                }
                
                var_8_1E1 = invokestatic:long(Files::size, p0:Path)
                var_10_1EA = and:int(ldc:int(15641), ldc:int(-15772))
                
                while (cmplt:boolean(var_10_1EA:int, and:int(ldc:int(3143), ldc:int(9728)))) {
                    var_11_22F = invokevirtual:int(IntBuffer::get, getfield:IntBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u12b2\uc31c\u4daf\uff55\ub6ab\u7006, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), var_10_1EA:int)
                    
                    if (cmpne:boolean(var_11_22F:int, ldc:int(0))) {
                        var_12_249 = invokestatic:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u3776\u1833\u9033\uc238\u4f52\u3d4b, var_11_22F:int)
                        var_13_250 = invokestatic:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\uc29a\u0a06\u4f4a\uc4d2\ud4fe\ub32d, var_11_22F:int)
                        
                        if (cmpge:boolean(var_12_249:int, and:int(ldc:int(3), ldc:int(11598)))) {
                            if (cmpne:boolean(var_13_250:int, ldc:int(0))) {
                                if (cmple:boolean(mul:long(i2l:long(var_12_249:int), ldc:long(4096L)), var_8_1E1:long)) {
                                    invokevirtual:void(\ub70c\u7bad\u1833\uc87f\u59ec::\uc238\u8709\u67e9\u5bc4\ub83f\u59ec, getfield:\ub70c\u7bad\u1833\uc87f\u59ec(\u52d3\u36d3\u4e72\uf94d\ucfaf::\ube23\u8258\ua562\ucef1\u3504\u760c, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), var_12_249:int, var_13_250:int)
                                }
                                else {
                                    invokeinterface:void(Logger::warn, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), and:int(ldc:int(5020), ldc:int(3111))), p0:Path[expected:Object], invokestatic:Integer[expected:Object](Integer::valueOf, var_10_1EA:int), invokestatic:Integer(Integer::valueOf, var_12_249:int))
                                    invokevirtual:IntBuffer(IntBuffer::put, getfield:IntBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u12b2\uc31c\u4daf\uff55\ub6ab\u7006, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), var_10_1EA:int, and:int(ldc:int(7355), ldc:int(-7420)))
                                }
                            }
                            else {
                                invokeinterface:void(Logger::warn, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), and:int(ldc:int(35), ldc:int(17795))), p0:Path[expected:Object], invokestatic:Integer(Integer::valueOf, var_10_1EA:int))
                                invokevirtual:IntBuffer(IntBuffer::put, getfield:IntBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u12b2\uc31c\u4daf\uff55\ub6ab\u7006, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), var_10_1EA:int, and:int(ldc:int(483), ldc:int(-2532)))
                            }
                        }
                        else {
                            invokeinterface:void(Logger::warn, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), xor:int(ldc:int(4113), ldc:int(4115))), p0:Path[expected:Object], invokestatic:Integer[expected:Object](Integer::valueOf, var_10_1EA:int), invokestatic:Integer(Integer::valueOf, var_12_249:int))
                            invokevirtual:IntBuffer(IntBuffer::put, getfield:IntBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u12b2\uc31c\u4daf\uff55\ub6ab\u7006, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), var_10_1EA:int, and:int(ldc:int(29714), ldc:int(-29971)))
                        }
                    }
                    
                    inc:int(var_10_1EA, ldc:int(1))
                }
            }
            
            return:void()
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), and:int(ldc:int(4040), ldc:int(-4076)))), invokeinterface:Path[expected:Object](Path::toAbsolutePath, p1:Path)))))
    }
    
    private java.nio.file.Path \ubded\uc29a\ucfaf\u8d90\u6fb0\u3c25(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
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
            return:Path(invokeinterface:Path(Path::resolve, getfield:Path(\u52d3\u36d3\u4e72\uf94d\ucfaf::\ub171\ub7dc\ub7dc\u7af6\uae5d\u59ec, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), xor:int(ldc:int(8290), ldc:int(8295)))), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\uc7fe\u8aa5\u69d9\u64ab\u71f1\u9af2, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), xor:int(ldc:int(4130), ldc:int(4132)))), getfield:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u3d4b\u12b2\u98a4\u0b8e\u8cae\u183a, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), xor:int(ldc:int(832), ldc:int(839)))))))
        }
        
        goto(Label_0006)
    }
    
    public synchronized java.io.DataInputStream \u8d98\ub113\ubcb0\u7d52\u392e\ufcaf(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
        var_2_5F : int
        var_4_65 : int
        var_2_70 : int
        var_5_76 : int
        var_7_89 : int
        var_8_90 : ByteBuffer
        var_2_C1 : int
        var_9_C7 : int
        var_10_CE : byte
        var_2_125 : int
        var_11_E5 : int
        
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
        var_2_5F = and:int(ldc:int(-35026815), ldc:int(2075109349))
        var_4_65 = invokespecial:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u56bd\u9255\uc87f\ub7dc\u71f1\u4179, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
        
        if (cmpeq:boolean(var_4_65:int, ldc:int(0))) {
            return:DataInputStream(aconstnull:DataInputStream())
        }
        
        var_2_70 = and:int(var_2_5F:int, ldc:int(1806693112))
        var_5_76 = invokestatic:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u3776\u1833\u9033\uc238\u4f52\u3d4b, var_4_65:int)
        var_7_89 = mul:int(invokestatic:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\uc29a\u0a06\u4f4a\uc4d2\ud4fe\ub32d, var_4_65:int), and:int(ldc:int(4538), ldc:int(21057)))
        var_8_90 = invokestatic:ByteBuffer(ByteBuffer::allocate, var_7_89:int)
        invokevirtual:int(FileChannel::read, getfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), var_8_90:ByteBuffer, i2l:long(mul:int(var_5_76:int, and:int(ldc:int(12368), ldc:int(22407)))))
        invokevirtual:Buffer(Buffer::flip, var_8_90:ByteBuffer[expected:Buffer])
        
        if (cmplt:boolean(invokevirtual:int(Buffer::remaining, var_8_90:ByteBuffer[expected:Buffer]), and:int(ldc:int(10669), ldc:int(4613)))) {
            invokeinterface:void(Logger::error, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), and:int(ldc:int(28814), ldc:int(2377))), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object], invokestatic:Integer[expected:Object](Integer::valueOf, var_7_89:int), invokestatic:Integer(Integer::valueOf, invokevirtual:int(Buffer::remaining, var_8_90:ByteBuffer[expected:Buffer])))
            return:DataInputStream(aconstnull:DataInputStream())
        }
        
        var_2_C1 = and:int(var_2_70:int, ldc:int(-34623855))
        var_9_C7 = invokevirtual:int(ByteBuffer::getInt, var_8_90:ByteBuffer)
        var_10_CE = invokevirtual:byte(ByteBuffer::get, var_8_90:ByteBuffer)
        
        if (cmpeq:boolean(var_9_C7:int, ldc:int(0))) {
            invokeinterface:void(Logger::warn, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), and:int(ldc:int(4233), ldc:int(1579))), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object])
            return:DataInputStream(aconstnull:DataInputStream())
        }
        
        var_2_125 = and:int(var_2_C1:int, ldc:int(2139089819))
        var_11_E5 = sub:int(var_9_C7:int, xor:int(ldc:int(-32507), ldc:int(-32508)))
        
        if (invokestatic:boolean(\u52d3\u36d3\u4e72\uf94d\ucfaf::\uae87\u759a\u7043\u927d\u9a18\ua61f, var_10_CE:byte)) {
            if (cmpne:boolean(var_11_E5:int, ldc:int(0))) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), and:int(ldc:int(12298), ldc:int(10))))
            }
            
            return:DataInputStream(invokespecial:DataInputStream(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u3bd6\u88c5\u624e\u8709\ubefe\u2dcc, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, invokestatic:byte(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u12cb\u3776\u34df\u3711\u8bb0\u3d4b, var_10_CE:byte)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_125:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0316)
            }
            
            if (cmpeq:boolean(and:int(var_2_125:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_125 = and:int(var_2_125:int, ldc:int(-303230349))
            }
            else {
                var_2_125 = and:int(var_2_125:int, ldc:int(-33966371))
                
                if (cmpgt:boolean(var_11_E5:int, invokevirtual:int(Buffer::remaining, var_8_90:ByteBuffer[expected:Buffer]))) {
                    invokeinterface:void(Logger::error, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), xor:int(ldc:int(17002), ldc:int(16993))), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object], invokestatic:Integer(Integer::valueOf, var_11_E5:int), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(Buffer::remaining, var_8_90:ByteBuffer[expected:Buffer])))
                    return:DataInputStream(aconstnull:DataInputStream())
                }
            }
            
            Label_0280:
            
            if (cmpeq:boolean(and:int(var_2_125:int, ldc:int(524288)), ldc:int(0))) {
                var_2_125 = and:int(var_2_125:int, ldc:int(1240138739))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_125:int, ldc:int(32768)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_125 = and:int(var_2_125:int, ldc:int(-448804714))
                
                if (cmplt:boolean(var_11_E5:int, ldc:int(0))) {
                    invokeinterface:void(Logger::error, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), and:int(ldc:int(798), ldc:int(15565))), invokestatic:Integer(Integer::valueOf, var_9_C7:int), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object])
                    return:DataInputStream(aconstnull:DataInputStream())
                }
            }
            
            Label_0316:
            
            if (cmpeq:boolean(and:int(var_2_125:int, ldc:int(32768)), ldc:int(0))) {
                var_2_125 = and:int(var_2_125:int, ldc:int(1025406532))
                goto(Label_0280)
            }
            
            if (cmpeq:boolean(and:int(var_2_125:int, ldc:int(32)), ldc:int(0))) {
                return:DataInputStream(invokespecial:DataInputStream(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u6fb0\u3776\u34df\ubded\u3776\u92ff, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, var_10_CE:byte, invokestatic:ByteArrayInputStream(\u52d3\u36d3\u4e72\uf94d\ucfaf::\ud171\ud217\uc2e8\u8753\u759a\u71ae, var_8_90:ByteBuffer, var_11_E5:int)))
            }
            
            var_2_125 = and:int(var_2_125:int, ldc:int(-1316695116))
        }
    }
    
    private static boolean \uae87\u759a\u7043\u927d\u9a18\ua61f(byte p0) {
        var_1_61 : int
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
            var_1_61 = and:int(ldc:int(1018704918), ldc:int(1529788280))
            
            if (cmpeq:boolean(and:int(p0:byte[expected:int], xor:int(ldc:int(13339), ldc:int(13467))), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1598048120))
                stack_8F_0 = and:int(ldc:int(22928), ldc:int(-23028))
            }
            else {
                stack_8F_0 = and:int(ldc:int(67), ldc:int(18433))
            }
            
            return:boolean(stack_8F_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static byte \u12cb\u3776\u34df\u3711\u8bb0\u3d4b(byte p0) {
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
            return:byte(i2b:byte(and:int(p0:byte[expected:int], xor:int(ldc:int(5700), ldc:int(-5829)))))
        }
        
        goto(Label_0006)
    }
    
    private java.io.DataInputStream \u6fb0\u3776\u34df\ubded\u3776\u92ff(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, byte p1, java.io.InputStream p2) {
        var_6_69 : \u0b8e\uc2e8\u98a4\u7e3f\u8c8a
        
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
        var_6_69 = invokestatic:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a(\u0b8e\uc2e8\u98a4\u7e3f\u8c8a::\uf94d\u6198\u6fb0\u4f52\u92ee\u4bc8, p1:byte[expected:int])
        
        if (cmpne:boolean(var_6_69:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a, aconstnull:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a())) {
            return:DataInputStream(initobject:DataInputStream(DataInputStream::<init>, initobject:BufferedInputStream(BufferedInputStream::<init>, invokevirtual:InputStream(\u0b8e\uc2e8\u98a4\u7e3f\u8c8a::\u516c\ubf56\u76bc\u6d69\u8bb0\u69d9, var_6_69:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a, p2:InputStream))))
        }
        
        invokeinterface:void(Logger::error, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), xor:int(ldc:int(12558), ldc:int(12547))), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object], invokestatic:Byte[expected:Object](Byte::valueOf, p1:byte))
        return:DataInputStream(aconstnull:DataInputStream())
    }
    
    private java.io.DataInputStream \u3bd6\u88c5\u624e\u8709\ubefe\u2dcc(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, byte p1) {
        var_5_67 : Path
        
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
        var_5_67 = invokespecial:Path(\u52d3\u36d3\u4e72\uf94d\ucfaf::\ubded\uc29a\ucfaf\u8d90\u6fb0\u3c25, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
        
        if (invokestatic:boolean(Files::isRegularFile, var_5_67:Path, newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(-2807), ldc:int(2772))))) {
            return:DataInputStream(invokespecial:DataInputStream(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u6fb0\u3776\u34df\ubded\u3776\u92ff, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, p1:byte, invokestatic:InputStream(Files::newInputStream, var_5_67:Path, newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(5638), ldc:int(-5639))))))
        }
        
        invokeinterface:void(Logger::error, getstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56), loadelement:String(getstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d), xor:int(ldc:int(-16376), ldc:int(-16378))), var_5_67:Path[expected:Object])
        return:DataInputStream(aconstnull:DataInputStream())
    }
    
    private static java.io.ByteArrayInputStream \ud171\ud217\uc2e8\u8753\u759a\u71ae(java.nio.ByteBuffer p0, int p1) {
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
            return:ByteArrayInputStream(initobject:ByteArrayInputStream(ByteArrayInputStream::<init>, invokevirtual:byte[](ByteBuffer::array, p0:ByteBuffer), invokevirtual:int(Buffer::position, p0:ByteBuffer[expected:Buffer]), p1:int))
        }
        
        goto(Label_0006)
    }
    
    private int \u6cfe\u3776\u3504\u6c52\ufcaf\u927d(int p0, int p1) {
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
            return:int(or:int(shl:int(p0:int, ldc:int(8)), p1:int))
        }
        
        goto(Label_0006)
    }
    
    private static int \uc29a\u0a06\u4f4a\uc4d2\ud4fe\ub32d(int p0) {
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
            return:int(and:int(p0:int, and:int(ldc:int(16639), ldc:int(6655))))
        }
        
        goto(Label_0006)
    }
    
    private static int \u3776\u1833\u9033\uc238\u4f52\u3d4b(int p0) {
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
            return:int(and:int(shr:int(p0:int, ldc:int(8)), ldc:int(16777215)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u40a9\u4c04\u760c\u64f2\u0a06\u7af6(int p0) {
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
            return:int(div:int(sub:int(add:int(p0:int, and:int(ldc:int(22064), ldc:int(4362))), xor:int(ldc:boolean(0), ldc:boolean(1))), xor:int(ldc:int(3563), ldc:int(7659))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6b0d\u392e\u59ec\u59ec\u0b8e\ubefe(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
        var_2_67 : int
        var_4_6D : int
        var_5_C7 : int
        var_2_CE : int
        var_6_D4 : int
        var_2_20E : int
        var_7_E6 : ByteBuffer
        var_8_226 : int
        var_9_233 : byte
        var_10_976 : int
        stack_A50_0 : int [generated]
        stack_6A2_0 : int [generated]
        stack_51F_0 : int [generated]
        stack_7EB_0 : int [generated]
        stack_967_0 : int [generated]
        stack_A94_0 : int [generated]
        stack_21C_0 : int [generated]
        
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
        var_2_67 = and:int(and:int(ldc:int(-1537067297), ldc:int(-1268293898)), ldc:int(-1268027406))
        var_4_6D = invokespecial:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u56bd\u9255\uc87f\ub7dc\u71f1\u4179, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
        
        loop {
            if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0160)
            }
            
            if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(134217728)), ldc:int(0))) {
                var_2_67 = and:int(var_2_67:int, ldc:int(-1107822627))
                
                if (cmpne:boolean(var_4_6D:int, ldc:int(0))) {
                    var_5_C7 = invokestatic:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u3776\u1833\u9033\uc238\u4f52\u3d4b, var_4_6D:int)
                    var_2_CE = and:int(var_2_67:int, ldc:int(-405950760))
                    var_6_D4 = invokestatic:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\uc29a\u0a06\u4f4a\uc4d2\ud4fe\ub32d, var_4_6D:int)
                    var_2_20E = and:int(var_2_CE:int, ldc:int(-288184584))
                    var_7_E6 = invokestatic:ByteBuffer(ByteBuffer::allocate, xor:int(ldc:int(81), ldc:int(84)))
                    
                    try {
                        loop {
                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_0462)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_0415)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(64)), ldc:int(0))) {
                                var_2_20E = and:int(var_2_20E:int, ldc:int(2010889329))
                                goto(Label_0353)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(524288)), ldc:int(0))) {
                                var_2_20E = and:int(var_2_20E:int, ldc:int(-422689034))
                                invokevirtual:int(FileChannel::read, getfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), var_7_E6:ByteBuffer, i2l:long(mul:int(var_5_C7:int, xor:int(ldc:int(2785), ldc:int(6881)))))
                            }
                            
                            Label_0300:
                            
                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                var_2_20E = and:int(var_2_20E:int, ldc:int(-733650721))
                                goto(Label_0462)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                goto(Label_0415)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(134217728)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_20E = and:int(var_2_20E:int, ldc:int(-215045))
                                invokevirtual:Buffer(Buffer::flip, var_7_E6:ByteBuffer[expected:Buffer])
                            }
                            
                            Label_0353:
                            
                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                goto(Label_0462)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                    goto(Label_0300)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(1024)), ldc:int(0))) {
                                    var_2_20E = and:int(var_2_20E:int, ldc:int(1913830115))
                                    loopcontinue()
                                }
                                
                                var_2_20E = and:int(var_2_20E:int, ldc:int(-1082648624))
                                
                                if (cmpeq:boolean(invokevirtual:int(Buffer::remaining, var_7_E6:ByteBuffer[expected:Buffer]), and:int(ldc:int(13333), ldc:int(271)))) {
                                    var_8_226 = invokevirtual:int(ByteBuffer::getInt, var_7_E6:ByteBuffer)
                                    var_2_20E = and:int(var_2_20E:int, ldc:int(-1227149357))
                                    var_9_233 = invokevirtual:byte(ByteBuffer::get, var_7_E6:ByteBuffer)
                                    
                                    loop {
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(8388608)), ldc:int(0))) {
                                            goto(Label_2195)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(747246403))
                                            goto(Label_2037)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-542726533))
                                            goto(Label_1833)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(64)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-748820708))
                                            goto(Label_1711)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1628136078))
                                            goto(Label_1495)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(1048576)), ldc:int(0))) {
                                            goto(Label_1337)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-593677084))
                                            goto(Label_1126)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(536870912)), ldc:int(0))) {
                                            goto(Label_0977)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(8388608)), ldc:int(0))) {
                                            goto(Label_0844)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(1048576)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1720131521))
                                        }
                                        else {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-405379078))
                                            
                                            if (logicalnot:boolean(invokestatic:boolean(\u52d3\u36d3\u4e72\uf94d\ucfaf::\uae87\u759a\u7043\u927d\u9a18\ua61f, var_9_233:byte))) {
                                                if (logicalnot:boolean(invokestatic:boolean(\u0b8e\uc2e8\u98a4\u7e3f\u8c8a::\u62da\u52d3\u6b0d\u8df4\u960f\ub19c, var_9_233:byte[expected:int]))) {
                                                    goto(Label_1711)
                                                }
                                                
                                                if (cmpeq:boolean(var_8_226:int, ldc:int(0))) {
                                                    goto(Label_2037)
                                                }
                                                
                                                var_10_976 = sub:int(var_8_226:int, and:int(ldc:int(93), ldc:int(10497)))
                                                
                                                loop {
                                                    if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(268435456)), ldc:int(0))) {
                                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-1137505236))
                                                        goto(Label_2588)
                                                    }
                                                    
                                                    if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                                        goto(Label_2549)
                                                    }
                                                    
                                                    if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(8388608)), ldc:int(0))) {
                                                        var_2_20E = and:int(var_2_20E:int, ldc:int(1513303691))
                                                    }
                                                    else {
                                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-1258483716))
                                                        
                                                        if (cmplt:boolean(var_10_976:int, ldc:int(0))) {
                                                            goto(Label_2588)
                                                        }
                                                    }
                                                    
                                                    Label_2477:
                                                    
                                                    if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(536870912)), ldc:int(0))) {
                                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-802690423))
                                                        goto(Label_2588)
                                                    }
                                                    
                                                    if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                                        var_2_20E = and:int(var_2_20E:int, ldc:int(2105315390))
                                                    }
                                                    else {
                                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                                            var_2_20E = and:int(var_2_20E:int, ldc:int(981661376))
                                                            loopcontinue()
                                                        }
                                                        
                                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-1084139782))
                                                        
                                                        if (cmple:boolean(var_10_976:int, mul:int(xor:int(ldc:int(-6696), ldc:int(-2600)), var_6_D4:int))) {
                                                            looporswitchbreak(Label_2645)
                                                        }
                                                    }
                                                    
                                                    Label_2549:
                                                    
                                                    if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(1024)), ldc:int(0))) {
                                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(1024)), ldc:int(0))) {
                                                            goto(Label_2477)
                                                        }
                                                        
                                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1188671293))
                                                            loopcontinue()
                                                        }
                                                        
                                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-310405423))
                                                    }
                                                    
                                                    Label_2588:
                                                    
                                                    if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(2147483647)), ldc:int(0))) {
                                                        goto(Label_2549)
                                                    }
                                                    
                                                    if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(524288)), ldc:int(0))) {
                                                        goto(Label_2477)
                                                    }
                                                    
                                                    if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(262144)), ldc:int(0))) {
                                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-1502427174))
                                                        stack_A50_0 = and:int(ldc:int(6385), ldc:int(-7666))
                                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-187115817))
                                                        return:boolean(stack_A50_0:boolean)
                                                    }
                                                    
                                                    var_2_20E = and:int(var_2_20E:int, ldc:int(-888347433))
                                                }
                                            }
                                        }
                                        
                                        Label_0713:
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(268435456)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1579497742))
                                            goto(Label_2195)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(268435456)), ldc:int(0))) {
                                            goto(Label_2037)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(268435456)), ldc:int(0))) {
                                            goto(Label_1833)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                            goto(Label_1711)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(262144)), ldc:int(0))) {
                                            goto(Label_1495)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(64)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-353804763))
                                            goto(Label_1337)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(557976074))
                                            goto(Label_1126)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(64)), ldc:int(0))) {
                                            goto(Label_0977)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1519923254))
                                        }
                                        else {
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-2120896128))
                                                loopcontinue()
                                            }
                                            
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-135483405))
                                        }
                                        
                                        Label_0844:
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(1024)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1659001063))
                                            goto(Label_2195)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(134217728)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-872935528))
                                            goto(Label_2037)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                            goto(Label_1833)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(1024)), ldc:int(0))) {
                                            goto(Label_1711)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                            goto(Label_1495)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(8388608)), ldc:int(0))) {
                                            goto(Label_1337)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                            goto(Label_1126)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(536870912)), ldc:int(0))) {
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-1846670621))
                                                goto(Label_0713)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(2147483647)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1768206608))
                                                loopcontinue()
                                            }
                                            
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-462842157))
                                            
                                            if (invokestatic:boolean(\u0b8e\uc2e8\u98a4\u7e3f\u8c8a::\u62da\u52d3\u6b0d\u8df4\u960f\ub19c, invokestatic:byte(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u12cb\u3776\u34df\u3711\u8bb0\u3d4b, var_9_233:byte))) {
                                                if (logicalnot:boolean(invokestatic:boolean(Files::isRegularFile, invokespecial:Path(\u52d3\u36d3\u4e72\uf94d\ucfaf::\ubded\uc29a\ucfaf\u8d90\u6fb0\u3c25, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), newarray:LinkOption[](java.nio.file.LinkOption.class, and:int(ldc:int(1615), ldc:int(-8016)))))) {
                                                    goto(Label_1337)
                                                }
                                                
                                                looporswitchbreak()
                                            }
                                        }
                                        
                                        Label_0977:
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(8388608)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1014789022))
                                            goto(Label_2195)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(268435456)), ldc:int(0))) {
                                            goto(Label_2037)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(417955909))
                                            goto(Label_1833)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(506302395))
                                            goto(Label_1711)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(134217728)), ldc:int(0))) {
                                            goto(Label_1495)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1984679120))
                                            goto(Label_1337)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(524288)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(156085031))
                                                goto(Label_0844)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(1024)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-998587463))
                                                goto(Label_0713)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1132687829))
                                                loopcontinue()
                                            }
                                            
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1505376263))
                                        }
                                        
                                        Label_1126:
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(262144)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-246764919))
                                            goto(Label_2195)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(524288)), ldc:int(0))) {
                                            goto(Label_2037)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                            goto(Label_1833)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(268435456)), ldc:int(0))) {
                                            goto(Label_1711)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(2114962449))
                                            goto(Label_1495)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1305875840))
                                                goto(Label_0977)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(2147483647)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-338775664))
                                                goto(Label_0844)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(134217728)), ldc:int(0))) {
                                                goto(Label_0713)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1018205999))
                                                loopcontinue()
                                            }
                                            
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-462188592))
                                            stack_6A2_0 = stack_51F_0 = stack_7EB_0 = stack_967_0 = stack_A94_0 = and(ldc(17609), ldc(-17610))
                                            goto(Label_1264)
                                        }
                                        
                                        Label_1337:
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(699024957))
                                            goto(Label_2195)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(524288)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1063348829))
                                            goto(Label_2037)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1384737156))
                                            goto(Label_1833)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(2147483647)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(780527405))
                                            goto(Label_1711)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1444102460))
                                        }
                                        else {
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                                goto(Label_1126)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                                goto(Label_0977)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(262144)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(2056740084))
                                                goto(Label_0844)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(262144)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1990748124))
                                                goto(Label_0713)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1640812681))
                                                loopcontinue()
                                            }
                                            
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1402654759))
                                        }
                                        
                                        Label_1495:
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(2147483647)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-306149331))
                                            goto(Label_2195)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(64)), ldc:int(0))) {
                                            goto(Label_2037)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                            goto(Label_1833)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(134217728)), ldc:int(0))) {
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(1024)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(396444098))
                                                goto(Label_1337)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(1024)), ldc:int(0))) {
                                                goto(Label_1126)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1500877076))
                                                goto(Label_0977)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(269163832))
                                                goto(Label_0844)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(536870912)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(827488182))
                                                goto(Label_0713)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-1922771883))
                                                loopcontinue()
                                            }
                                            
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-152219951))
                                            stack_6A2_0 = stack_51F_0 = stack_7EB_0 = stack_967_0 = stack_A94_0 = and(ldc(8222), ldc(-8991))
                                            goto(Label_1642)
                                        }
                                        
                                        Label_1711:
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                            goto(Label_2195)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(840075895))
                                            goto(Label_2037)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-1923543371))
                                                goto(Label_1495)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(8388608)), ldc:int(0))) {
                                                goto(Label_1337)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-1221505043))
                                                goto(Label_1126)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                                goto(Label_0977)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                                goto(Label_0844)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1020346817))
                                                goto(Label_0713)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(512)), ldc:int(0))) {
                                                loopcontinue()
                                            }
                                            
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-287381512))
                                        }
                                        
                                        Label_1833:
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(134217728)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1788618697))
                                            goto(Label_2195)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(8388608)), ldc:int(0))) {
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(2147483647)), ldc:int(0))) {
                                                goto(Label_1711)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(524288)), ldc:int(0))) {
                                                goto(Label_1495)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                                goto(Label_1337)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                                goto(Label_1126)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(1024)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1481220918))
                                                goto(Label_0977)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-632219804))
                                                goto(Label_0844)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-1036914680))
                                                goto(Label_0713)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1510207481))
                                                loopcontinue()
                                            }
                                            
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1477167406))
                                            stack_6A2_0 = stack_51F_0 = stack_7EB_0 = stack_967_0 = stack_A94_0 = and(ldc(-23918), ldc(20748))
                                            goto(Label_1971)
                                        }
                                        
                                        Label_2037:
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1054227878))
                                        }
                                        else {
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(1145718018))
                                                goto(Label_1833)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                                goto(Label_1711)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(8388608)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-67026517))
                                                goto(Label_1495)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-197896495))
                                                goto(Label_1337)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-214892390))
                                                goto(Label_1126)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-1404760297))
                                                goto(Label_0977)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(536870912)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-2043771705))
                                                goto(Label_0844)
                                            }
                                            
                                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                                goto(Label_0713)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(233603008))
                                                loopcontinue()
                                            }
                                            
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1486450954))
                                        }
                                        
                                        Label_2195:
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-43145334))
                                            goto(Label_2037)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1338002102))
                                            goto(Label_1833)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(268435456)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1066729896))
                                            goto(Label_1711)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(64)), ldc:int(0))) {
                                            goto(Label_1495)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                            goto(Label_1337)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(134217728)), ldc:int(0))) {
                                            goto(Label_1126)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(1048576)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(547599346))
                                            goto(Label_0977)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(512)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1363626935))
                                            goto(Label_0844)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(512)), ldc:int(0))) {
                                            goto(Label_0713)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-402653452))
                                            stack_6A2_0 = stack_51F_0 = stack_7EB_0 = stack_967_0 = stack_A94_0 = and(ldc(-19725), ldc(19724))
                                            goto(Label_2333)
                                        }
                                        
                                        loopcontinue()
                                        Label_1264:
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(1024)), ldc:int(0))) {
                                            goto(Label_2652)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1576003036))
                                            goto(Label_2333)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                            goto(Label_1971)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(268435456)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1537155336))
                                            return:boolean(stack_51F_0:int)
                                        }
                                        
                                        Label_1642:
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-2073402378))
                                            goto(Label_2652)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(268435456)), ldc:int(0))) {
                                            goto(Label_2333)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(128)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-218735715))
                                                goto(Label_1264)
                                            }
                                            
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1094596872))
                                            return:boolean(stack_6A2_0:int)
                                        }
                                        
                                        Label_1971:
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                            goto(Label_2652)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(524288)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1549979643))
                                        }
                                        else {
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(64)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(236676706))
                                                goto(Label_1642)
                                            }
                                            
                                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                                var_2_20E = and:int(var_2_20E:int, ldc:int(-185225264))
                                                return:boolean(stack_7EB_0:int)
                                            }
                                            
                                            goto(Label_1264)
                                        }
                                        
                                        Label_2333:
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-1706218849))
                                            goto(Label_2652)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(2048)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(1860861721))
                                            goto(Label_1971)
                                        }
                                        
                                        if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(1048576)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(999676081))
                                            goto(Label_1642)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                            var_2_20E = and:int(var_2_20E:int, ldc:int(-363793687))
                                            goto(Label_1264)
                                        }
                                        
                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-320145420))
                                        return:boolean(stack_967_0:boolean)
                                    }
                                    
                                    Label_2645:
                                    stack_6A2_0 = stack_51F_0 = stack_7EB_0 = stack_967_0 = stack_A94_0 = and(ldc(12929), ldc(69))
                                    Label_2652:
                                    
                                    if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(67108864)), ldc:int(0))) {
                                        goto(Label_2333)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-682488539))
                                        goto(Label_1971)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-1620819104))
                                        goto(Label_1642)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(512)), ldc:int(0))) {
                                        var_2_20E = and:int(var_2_20E:int, ldc:int(-1362106625))
                                        return:boolean(stack_A94_0:int)
                                    }
                                    
                                    goto(Label_1264)
                                }
                            }
                            
                            Label_0415:
                            
                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(32)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(512)), ldc:int(0))) {
                                    var_2_20E = and:int(var_2_20E:int, ldc:int(1168823958))
                                    goto(Label_0353)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(8388608)), ldc:int(0))) {
                                    goto(Label_0300)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(16)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_20E = and:int(var_2_20E:int, ldc:int(-1394309387))
                            }
                            
                            Label_0462:
                            
                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_0415)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(8388608)), ldc:int(0))) {
                                var_2_20E = and:int(var_2_20E:int, ldc:int(1625741616))
                                goto(Label_0353)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_20E:int, ldc:int(4194304)), ldc:int(0))) {
                                var_2_20E = and:int(var_2_20E:int, ldc:int(-1657311171))
                                goto(Label_0300)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_20E:int, ldc:int(536870912)), ldc:int(0))) {
                                var_2_20E = and:int(var_2_20E:int, ldc:int(-1209997616))
                                stack_21C_0 = and:int(ldc:int(4825), ldc:int(-15066))
                                var_2_20E = and:int(var_2_20E:int, ldc:int(-167907373))
                                return:boolean(stack_21C_0:boolean)
                            }
                            
                            var_2_20E = and:int(var_2_20E:int, ldc:int(1150370782))
                        }
                    }
                    catch (java.io.IOException var_8_A99) {
                        return:boolean(and:int[expected:boolean](ldc:int(-10888), ldc:int(10886)))
                    }
                }
            }
            
            Label_0138:
            
            if (cmpne:boolean(and:int(var_2_67:int, ldc:int(536870912)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_67:int, ldc:int(33554432)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_67 = and:int(var_2_67:int, ldc:int(-1392742434))
            }
            
            Label_0160:
            
            if (cmpne:boolean(and:int(var_2_67:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0138)
            }
            
            if (cmpne:boolean(and:int(var_2_67:int, ldc:int(536870912)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(16541), ldc:int(-16542)))
            }
        }
    }
    
    public java.io.DataOutputStream \u6cfe\u7d52\ub32d\u64f2\u72f1\ud217(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
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
            return:DataOutputStream(initobject:DataOutputStream(DataOutputStream::<init>, initobject:BufferedOutputStream[expected:OutputStream](BufferedOutputStream::<init>, invokevirtual:OutputStream(\u0b8e\uc2e8\u98a4\u7e3f\u8c8a::\u4179\ud51e\ud217\u718f\ub32d\ud12e, getfield:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u4c2b\u9255\u6fb0\ubefe\u5f50\u47c2, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), initobject:\u4c2b\u873d\u98a4\ud12e\u61a4[expected:OutputStream](\u4c2b\u873d\u98a4\ud12e\u61a4::<init>, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)))))
        }
        
        goto(Label_0006)
    }
    
    public void \u7e3f\uc29a\ubefe\u7e3f\u4ab3\u7e3f() {
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
            invokevirtual:void(FileChannel::force, getfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), xor:int[expected:boolean](ldc:int(4481), ldc:int(4480)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public synchronized void \u5654\u624e\u760c\u69d9\u34df\uc246(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, java.nio.ByteBuffer p1) {
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
    
    private java.nio.ByteBuffer \u446c\u7c6b\u8350\uafe7\ucef1\u6c52() {
        var_3_6C : ByteBuffer
        
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
            var_3_6C = invokestatic:ByteBuffer(ByteBuffer::allocate, xor:int(ldc:int(193), ldc:int(196)))
            invokevirtual:ByteBuffer(ByteBuffer::putInt, var_3_6C:ByteBuffer, and:int(ldc:int(19985), ldc:int(325)))
            invokevirtual:ByteBuffer(ByteBuffer::put, var_3_6C:ByteBuffer, i2b:byte(or:int(invokevirtual:int(\u0b8e\uc2e8\u98a4\u7e3f\u8c8a::\u760c\ud36e\u61a4\u7c6b\u9af2\ud158, getfield:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u4c2b\u9255\u6fb0\ubefe\u5f50\u47c2, this:\u52d3\u36d3\u4e72\uf94d\ucfaf)), xor:int(ldc:int(-28668), ldc:int(-28540)))))
            invokevirtual:Buffer(Buffer::flip, var_3_6C:ByteBuffer[expected:Buffer])
            return:ByteBuffer(var_3_6C:ByteBuffer)
        }
        
        goto(Label_0006)
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u7bad\u7049\ud217\u8bb0\ubcb0 \u8bb0\u3c25\u72f1\uf94d\u3a62\uc29a(java.nio.file.Path p0, java.nio.ByteBuffer p1) {
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
    
    private void \ud51e\u7af6\u8350\u6bb9\ubefe\u183a() {
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
            invokevirtual:Buffer(Buffer::position, getfield:ByteBuffer[expected:Buffer](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u76bc\u64ab\u61a4\u839e\u7043\u4ab3, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), and:int(ldc:int(-28769), ldc:int(28768)))
            invokevirtual:int(FileChannel::write, getfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), getfield:ByteBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u76bc\u64ab\u61a4\u839e\u7043\u4ab3, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), ldc:long(0L))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \u56bd\u9255\uc87f\ub7dc\u71f1\u4179(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
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
            return:int(invokevirtual:int(IntBuffer::get, getfield:IntBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u12b2\uc31c\u4daf\uff55\ub6ab\u7006, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), invokestatic:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u67e9\uc3e3\u718f\u760c\u5654\u7049, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u98a4\u5f50\ub7dc\u6c56\ub7dc\uf94d(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
        var_2_61 : int
        stack_8B_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(860538047), ldc:int(-1712862277))
            
            if (cmpeq:boolean(invokespecial:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u56bd\u9255\uc87f\ub7dc\u71f1\u4179, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1162338730))
                stack_8B_0 = and:int(ldc:int(17526), ldc:int(-20087))
            }
            else {
                stack_8B_0 = and:int(ldc:int(4353), ldc:int(16385))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static int \u67e9\uc3e3\u718f\u760c\u5654\u7049(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
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
            return:int(add:int(invokevirtual:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u873d\u446c\u8350\ud158\uc9f6\u47c2, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), mul:int(invokevirtual:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u36d3\uc910\ud12e\ufcaf\ub19c\u51b2, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c), ldc:int(32))))
        }
        
        goto(Label_0006)
    }
    
    public void close() {
        var_1_1B5 : int
        
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
            var_1_1B5 = and:int(ldc:int(1019684570), ldc:int(2015854331))
            
            try {
                loop {
                    Label_0098:
                    
                    if (cmpeq:boolean(and:int(var_1_1B5:int, ldc:int(1024)), ldc:int(0))) {
                        var_1_1B5 = and:int(var_1_1B5:int, ldc:int(-1861500543))
                        goto(Label_0240)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(2048)), ldc:int(0))) {
                        var_1_1B5 = and:int(var_1_1B5:int, ldc:int(-1625547790))
                        goto(Label_0194)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0150)
                    }
                    
                    var_1_1B5 = and:int(var_1_1B5:int, ldc:int(968304600))
                    invokespecial:void(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u416d\u56bd\u0c95\u97e6\u7c6b\u0c95, this:\u52d3\u36d3\u4e72\uf94d\ucfaf)
                    
                    try {
                        loop {
                            Label_0150:
                            
                            if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_0240)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(64)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(1)), ldc:int(0))) {
                                    loopcontinue(Label_0098)
                                }
                                
                                var_1_1B5 = and:int(var_1_1B5:int, ldc:int(-412108802))
                                invokevirtual:void(FileChannel::force, getfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), and:int[expected:boolean](ldc:int(8515), ldc:int(153)))
                            }
                            
                            Label_0194:
                            
                            if (cmpeq:boolean(and:int(var_1_1B5:int, ldc:int(4096)), ldc:int(0))) {
                                if (cmpeq:boolean(and:int(var_1_1B5:int, ldc:int(64)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_1_1B5 = and:int(var_1_1B5:int, ldc:int(1652852502))
                                    loopcontinue(Label_0098)
                                }
                                
                                var_1_1B5 = and:int(var_1_1B5:int, ldc:int(-1215842565))
                                invokevirtual:void(AbstractInterruptibleChannel::close, getfield:FileChannel[expected:AbstractInterruptibleChannel](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf))
                            }
                            
                            Label_0240:
                            
                            if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(1)), ldc:int(0))) {
                                var_1_1B5 = and:int(var_1_1B5:int, ldc:int(-1796220932))
                                goto(Label_0194)
                            }
                            
                            if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(4)), ldc:int(0))) {
                                var_1_1B5 = and:int(var_1_1B5:int, ldc:int(572202234))
                            }
                            else {
                                if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(1024)), ldc:int(0))) {
                                    var_1_1B5 = and:int(var_1_1B5:int, ldc:int(-1127221794))
                                    looporswitchbreak()
                                }
                                
                                loopcontinue(Label_0098)
                            }
                        }
                    }
                    finally {
                        invokevirtual:void(AbstractInterruptibleChannel::close, getfield:FileChannel[expected:AbstractInterruptibleChannel](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf))
                        var_1_1B5 = and:int(var_1_1B5:int, ldc:int(648017146))
                    }
                    
                    looporswitchbreak()
                }
            }
            finally {
                try {
                    loop {
                        if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_1B5:int, ldc:int(4096)), ldc:int(0))) {
                            var_1_1B5 = and:int(var_1_1B5:int, ldc:int(2114942171))
                            invokevirtual:void(FileChannel::force, getfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), xor:int[expected:boolean](ldc:int(10245), ldc:int(10244)))
                        }
                        
                        Label_0360:
                        
                        if (cmpeq:boolean(and:int(var_1_1B5:int, ldc:int(131072)), ldc:int(0))) {
                            var_1_1B5 = and:int(var_1_1B5:int, ldc:int(-1449799353))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_1B5:int, ldc:int(128)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_1B5 = and:int(var_1_1B5:int, ldc:int(608172031))
                            invokevirtual:void(AbstractInterruptibleChannel::close, getfield:FileChannel[expected:AbstractInterruptibleChannel](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf))
                        }
                        
                        Label_0398:
                        
                        if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_1_1B5 = and:int(var_1_1B5:int, ldc:int(1654863359))
                            goto(Label_0360)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_1B5:int, ldc:int(16)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_1_1B5 = and:int(var_1_1B5:int, ldc:int(-1079382079))
                    }
                    
                    var_1_1B5 = and:int(var_1_1B5:int, ldc:int(642721501))
                }
                finally {
                    invokevirtual:void(AbstractInterruptibleChannel::close, getfield:FileChannel[expected:AbstractInterruptibleChannel](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u416d\u56bd\u0c95\u97e6\u7c6b\u0c95() {
        var_3_6A : int
        var_4_77 : int
        var_5_90 : ByteBuffer
        
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
            var_3_6A = l2i:int(invokevirtual:long(FileChannel::size, getfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf)))
            var_4_77 = mul:int(invokestatic:int(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u40a9\u4c04\u760c\u64f2\u0a06\u7af6, var_3_6A:int), xor:int(ldc:int(10363), ldc:int(14459)))
            
            if (cmpne:boolean(var_3_6A:int, var_4_77:int)) {
                var_5_90 = invokevirtual:ByteBuffer(ByteBuffer::duplicate, getstatic:ByteBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u62da\u72f1\u76bc\u7049\u3a62\ub102))
                invokevirtual:Buffer(Buffer::position, var_5_90:ByteBuffer[expected:Buffer], and:int(ldc:int(8620), ldc:int(-8621)))
                invokevirtual:int(FileChannel::write, getfield:FileChannel(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u97e6\u392e\u7330\uae87\ube23\u8aa5, this:\u52d3\u36d3\u4e72\uf94d\ucfaf), var_5_90:ByteBuffer, i2l:long(sub:int(var_4_77:int, xor:int(ldc:int(5153), ldc:int(5152)))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u4cd9\ubf56\u92ee\u3bc9\u98a4\ua562$1(java.nio.file.Path p0, java.nio.file.Path p1) {
        expr_6B : CopyOption[] [generated]
        
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
            expr_6B = newarray:CopyOption[](java.nio.file.CopyOption.class, xor:int(ldc:int(5160), ldc:int(5161)))
            storeelement:CopyOption(expr_6B:CopyOption[], and:int(ldc:int(-895), ldc:int(894)), getstatic:StandardCopyOption[expected:CopyOption](StandardCopyOption::REPLACE_EXISTING))
            invokestatic:Path(Files::move, p0:Path, p1:Path, expr_6B:CopyOption[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u59ec\ub18d\ub171\u8753\u5245\ub6ab$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
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
            invokestatic:boolean(Files::deleteIfExists, invokespecial:Path(\u52d3\u36d3\u4e72\uf94d\ucfaf::\ubded\uc29a\ucfaf\u8d90\u6fb0\u3c25, this:\u52d3\u36d3\u4e72\uf94d\ucfaf, p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u0b8e\uc2e8\u98a4\u7e3f\u8c8a \u8d98\u760c\u4c2b\ua6bd\u67d0\u965f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u52d3\u36d3\u4e72\uf94d\ucfaf p0) {
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
            return:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a(getfield:\u0b8e\uc2e8\u98a4\u7e3f\u8c8a(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u4c2b\u9255\u6fb0\ubefe\u5f50\u47c2, p0:\u52d3\u36d3\u4e72\uf94d\ucfaf))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_42A : int
        expr_6E : int [generated]
        stack_AE_0 : byte[] [generated]
        stack_B0_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_EB_0 : byte[] [generated]
        stack_122_0 : byte[] [generated]
        stack_124_0 : byte[] [generated]
        stack_15A_0 : byte[] [generated]
        stack_382_0 : byte[] [generated]
        stack_3D6_0 : byte[] [generated]
        stack_43D_0 : byte[] [generated]
        stack_4BB_0 : byte[] [generated]
        var_4_363 : int
        var_3_368 : byte[]
        var_5_369 : int
        expr_382 : byte [generated]
        var_0_457 : int
        expr_43D : byte [generated]
        stack_486_2 : byte [generated]
        stack_45A_0 : byte [generated]
        var_2_AE : byte[]
        expr_B2 : int [generated]
        var_3_3C4 : byte[]
        var_5_3C5 : int
        expr_EB : int [generated]
        expr_124 : int [generated]
        var_3_4A9 : byte[]
        var_5_4AA : int
        var_3_166 : String
        stack_349_0 : String[] [generated]
        expr_178 : String[] [generated]
        
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
        var_0_42A = and:int(ldc:int(-1635205606), ldc:int(-1097353786))
        expr_6E = arraylength:int(stack_AE_0 = stack_B0_0 = stack_E9_0 = stack_EB_0 = stack_122_0 = stack_124_0 = stack_15A_0 = stack_382_0 = stack_3D6_0 = stack_43D_0 = stack_4BB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("jjpDO0+rJ/5LCBoHXwMnSy8v7loHGwM84i8fEA6HTxdaM7oLPBNHU/oa+iNfV18fC6tXTxwjGgvbMgtD6jYrD/MXMzs7NiA3L1/+FvrzHytbRzb6N+dDW5s7Rtrio1dPHCMKysYCNzRPazATVjP+EuIb5g+EINKXf70Sb6LaPI87OC9G+tdSF/LuKzuHm1NO2uKjV08cI1bP2j4f8h4vS/4LOCjiY2sfXl8j2hr68w9vJC8+NyM+G+pjDzcrW6tXTxxDXg/CHvrzD28kT1Iz/hLiG+YPhCDSl3+9Em+i2jyPOzgvRvrXUhfy7is7h5sTGtLa7iMfGFsHjxsnS1vLMwbDykZLQz4gV08cI1bP2grq5lY7XyeTW0viL+ai2jwTC2cbGm8PI5s89w/u+hOOl0faWra6CzzSN1MfNiBH/ksjJzt/+x9az9oqP+8KMy/a2iPiIzd2PC8vKwsvi1ccWxIL2xILJAMmQxsyKw/zU/b6Yy4vMC8jHAsiF9KKXBiDjxzCVrLG9SovMI87GAtSz9pGN+8qA//iJk9DHlvX4v5H+n48Ly8rCy+LVxxbEgvbEgskAyZDGzIrD/NT9vpjLi8wLyMcCyIX0opcGIOPHMJW4iO5Iw8L/jhSDyDiAvdsL2zjCrk66XI8Ly8rCy+LVxxbEgvbMgtD6jYrD/NT9vpjLi8wLyMcCyIX0opcGIOPHMJWssb1Ki8wjzsY6kq2BzofM2PjM08fDycf+u76DjfjGx9f7no8Ly8rCy+LVxxbEgvbUjtT/hLiG+YPJEfSNysON4Qoj4+byULm1los8icLf1I/Uyve4/rmYzs2IFdPHCR6E9MSVvrKXn/PLzvjyo4rD1Yzugs80js/8ieLVw8wWt4X8OOw6Kwn")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_363 = expr_6E:int
        var_3_368 = newarray:byte[](byte.class, expr_6E:int)
        var_5_369 = expr_6E:int
        Label_0875:
        
        while (cmpne:boolean(and:int(var_0_42A:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_42A = and:int(var_0_42A:int, ldc:int(-1093599533))
            var_5_369 = add:int(var_5_369:int, ldc:int(-1))
            expr_382 = loadelement:byte(stack_382_0:byte[], var_5_369:int)
            storeelement:byte(var_3_368:byte[], var_5_369:int, add:int(or:int(and:int(shl:int(expr_382:byte, xor:int(ldc:int(8256), ldc:int(8260))), ldc:int(-16)), and:int(shr:int(expr_382:byte[expected:int], and:int(ldc:int(1045), ldc:int(5102))), ldc:int(15))), ldc:int(78)))
            
            if (cmpne:boolean(var_5_369:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E9_0 = stack_EB_0 = stack_122_0 = stack_124_0 = stack_15A_0 = stack_382_0 = stack_3D6_0 = stack_43D_0 = stack_4BB_0 = var_3_368:byte[]
            goto(Label_0115)
        }
        
        Label_1053:
        
        while (cmpne:boolean(and:int(var_0_42A:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_457 = and:int(var_0_42A:int, ldc:int(2143288731))
            var_5_369 = add:int(var_5_369:int, ldc:int(-1))
            expr_43D = stack_486_2 = loadelement(stack_43D_0, var_5_369)
            
            if (cmplt:boolean(add:int(add:int(var_5_369:int, ldc:int(5)), neg:int(var_4_363:int)), ldc:int(0))) {
                stack_486_2 = stack_45A_0 = add:byte(expr_43D:byte, loadelement:byte(var_3_368:byte[], add:int(var_5_369:int, ldc:int(5))))
                goto(Label_1130)
            }
            
            Label_1098:
            
            if (cmpne:boolean(and:int(var_0_457:int, ldc:int(8192)), ldc:int(0))) {
                var_0_457 = and:int(var_0_457:int, ldc:int(-1093157070))
                stack_486_2 = stack_45A_0 = add:byte(expr_43D:byte, ldc:byte(5))
            }
            
            Label_1130:
            
            if (cmpeq:boolean(and:int(var_0_457:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_457 = and:int(var_0_457:int, ldc:int(362141532))
                goto(Label_1098)
            }
            
            var_0_42A = and:int(var_0_457:int, ldc:int(530955999))
            storeelement:byte(var_3_368:byte[], var_5_369:int, stack_486_2:byte)
            
            if (cmpne:boolean(var_5_369:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E9_0 = stack_EB_0 = stack_122_0 = stack_124_0 = stack_15A_0 = stack_382_0 = stack_3D6_0 = stack_43D_0 = stack_4BB_0 = var_3_368:byte[]
            goto(Label_0240)
        }
        
        var_0_42A = and:int(var_0_42A:int, ldc:int(1756737603))
        goto(Label_0875)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_42A:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_42A = and:int(var_0_42A:int, ldc:int(-289161804))
            goto(Label_0297)
        }
        
        if (cmpeq:boolean(and:int(var_0_42A:int, ldc:int(32768)), ldc:int(0))) {
            var_0_42A = and:int(var_0_42A:int, ldc:int(-1542724062))
            goto(Label_0240)
        }
        
        if (cmpeq:boolean(and:int(var_0_42A:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_42A = and:int(var_0_42A:int, ldc:int(928599764))
        }
        else {
            var_0_42A = and:int(var_0_42A:int, ldc:int(529267766))
            var_2_AE = stack_AE_0:byte[]
            expr_B2 = add:int(arraylength:int(stack_B0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B2:int, ldc:int(0))) {
                var_3_3C4 = newarray:byte[](byte.class, expr_B2:int)
                var_5_3C5 = expr_B2:int
                
                loop {
                    var_0_42A = and:int(var_0_42A:int, ldc:int(1066205143))
                    var_5_3C5 = add:int(var_5_3C5:int, ldc:int(-1))
                    storeelement:byte(var_3_3C4:byte[], var_5_3C5:int, add:int(shl:int(loadelement:byte(stack_3D6_0:byte[], var_5_3C5:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_AE:byte[], add:int(var_5_3C5:int, xor:int(ldc:int(30720), ldc:int(30721)))), ldc:int(6)), and:int(ldc:int(16387), ldc:int(14683)))))
                    
                    if (cmpne:boolean(var_5_3C5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E9_0 = stack_EB_0 = stack_122_0 = stack_124_0 = stack_15A_0 = stack_382_0 = stack_3D6_0 = stack_43D_0 = stack_4BB_0 = var_3_3C4:byte[]
            }
        }
        
        Label_0183:
        
        if (cmpne:boolean(and:int(var_0_42A:int, ldc:int(128)), ldc:int(0))) {
            var_0_42A = and:int(var_0_42A:int, ldc:int(1374568547))
            goto(Label_0297)
        }
        
        if (cmpne:boolean(and:int(var_0_42A:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_42A:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_42A = and:int(var_0_42A:int, ldc:int(-77264211))
                goto(Label_0115)
            }
            
            var_0_42A = and:int(var_0_42A:int, ldc:int(1588002751))
            expr_EB = arraylength:int(stack_EB_0:byte[])
            
            if (cmpne:boolean(expr_EB:int, ldc:int(0))) {
                var_4_363 = expr_EB:int
                var_3_368 = newarray:byte[](byte.class, expr_EB:int)
                var_5_369 = expr_EB:int
                goto(Label_1053)
            }
        }
        
        Label_0240:
        
        if (cmpeq:boolean(and:int(var_0_42A:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_42A = and:int(var_0_42A:int, ldc:int(-807402957))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_42A:int, ldc:int(8192)), ldc:int(0))) {
                var_0_42A = and:int(var_0_42A:int, ldc:int(917234792))
                goto(Label_0183)
            }
            
            if (cmpeq:boolean(and:int(var_0_42A:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_42A = and:int(var_0_42A:int, ldc:int(1055587631))
            expr_124 = arraylength:int(stack_124_0:byte[])
            
            if (cmpne:boolean(expr_124:int, ldc:int(0))) {
                var_3_4A9 = newarray:byte[](byte.class, expr_124:int)
                var_5_4AA = expr_124:int
                
                loop {
                    var_0_42A = and:int(var_0_42A:int, ldc:int(1602663726))
                    var_5_4AA = add:int(var_5_4AA:int, ldc:int(-1))
                    storeelement:byte(var_3_4A9:byte[], var_5_4AA:int, xor:byte(loadelement:byte(stack_4BB_0:byte[], var_5_4AA:int), ldc:byte(24)))
                    
                    if (cmpne:boolean(var_5_4AA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E9_0 = stack_EB_0 = stack_122_0 = stack_124_0 = stack_15A_0 = stack_382_0 = stack_3D6_0 = stack_43D_0 = stack_4BB_0 = var_3_4A9:byte[]
            }
        }
        
        Label_0297:
        
        if (cmpne:boolean(and:int(var_0_42A:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0240)
        }
        
        if (cmpeq:boolean(and:int(var_0_42A:int, ldc:int(1024)), ldc:int(0))) {
            var_0_42A = and:int(var_0_42A:int, ldc:int(-1427795308))
            goto(Label_0183)
        }
        
        if (cmpeq:boolean(and:int(var_0_42A:int, ldc:int(4096)), ldc:int(0))) {
            var_0_42A = and:int(var_0_42A:int, ldc:int(-896811829))
            goto(Label_0115)
        }
        
        var_3_166 = initobject:String(String::<init>, stack_15A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_349_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10370), ldc:int(10387)))
        expr_178 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(24709), ldc:int(24724)))
        storeelement:String(expr_178:String[], and:int(ldc:int(262), ldc:int(16590)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(-15534), ldc:int(11405)), and:int(ldc:int(1057), ldc:int(781))))
        storeelement:String(expr_178:String[], xor:int(ldc:int(14594), ldc:int(14597)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(1097), ldc:int(4881)), and:int(ldc:int(2389), ldc:int(517))))
        storeelement:String(expr_178:String[], and:int(ldc:int(4618), ldc:int(446)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(4098), ldc:int(4103)), and:int(ldc:int(2167), ldc:int(313))))
        storeelement:String(expr_178:String[], and:int(ldc:int(141), ldc:int(4383)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(49), ldc:int(8509)), and:int(ldc:int(6237), ldc:int(93))))
        storeelement:String(expr_178:String[], and:int(ldc:int(360), ldc:int(17944)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(2397), ldc:int(24701)), xor:int(ldc:int(1043), ldc:int(1153))))
        storeelement:String(expr_178:String[], and:int(ldc:int(29), ldc:int(41)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(2093), ldc:int(2239)), and:int(ldc:int(5310), ldc:int(254))))
        storeelement:String(expr_178:String[], and:int(ldc:int(75), ldc:int(12315)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(-28539), ldc:int(-28613)), xor:int(ldc:int(-32560), ldc:int(-32733))))
        storeelement:String(expr_178:String[], and:int(ldc:int(9502), ldc:int(2732)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(247), ldc:int(8947)), and:int(ldc:int(6555), ldc:int(9563))))
        storeelement:String(expr_178:String[], and:int(ldc:int(-18014), ldc:int(17501)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(9183), ldc:int(20763)), xor:int(ldc:int(17333), ldc:int(17030))))
        storeelement:String(expr_178:String[], and:int(ldc:int(6798), ldc:int(8302)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(307), ldc:int(15283)), and:int(ldc:int(8533), ldc:int(1525))))
        storeelement:String(expr_178:String[], and:int(ldc:int(1573), ldc:int(24580)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(18781), ldc:int(1909)), xor:int(ldc:int(8883), ldc:int(8977))))
        storeelement:String(expr_178:String[], and:int(ldc:int(12323), ldc:int(731)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(26087), ldc:int(2490)), xor:int(ldc:int(10097), ldc:int(9878))))
        storeelement:String(expr_178:String[], and:int(ldc:int(1170), ldc:int(12298)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(2535), ldc:int(8695)), and:int(ldc:int(1597), ldc:int(2741))))
        storeelement:String(expr_178:String[], xor:int(ldc:int(1152), ldc:int(1153)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(567), ldc:int(25149)), xor:int(ldc:int(2244), ldc:int(2712))))
        storeelement:String(expr_178:String[], xor:int(ldc:int(5128), ldc:int(5127)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(10204), ldc:int(19068)), and:int(ldc:int(3988), ldc:int(12982))))
        storeelement:String(expr_178:String[], and:int(ldc:int(19463), ldc:int(4277)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(758), ldc:int(668)), and:int(ldc:int(21142), ldc:int(918))))
        storeelement:String(expr_178:String[], xor:int(ldc:int(-21489), ldc:int(-21473)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(640), ldc:int(22)), xor:int(ldc:int(17967), ldc:int(17590))))
        putstatic:String[](\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7d52\u516c\u16f6\u67d0\uff55\u416d, expr_178:String[])
        putstatic:Logger(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u7af6\u516c\u8aa5\u67d0\uc9f6\u6c56, invokestatic:Logger(LogManager::getLogger))
        putstatic:ByteBuffer(\u52d3\u36d3\u4e72\uf94d\ucfaf::\u62da\u72f1\u76bc\u7049\u3a62\ub102, invokestatic:ByteBuffer(ByteBuffer::allocateDirect, xor:int(ldc:int(1696), ldc:int(1697))))
    }
    
    public void \u7bad\u5bc4\u446c\u3504\u8258\u12cb(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6AA : int
        
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
        var_3_69F = and:int(ldc:int(-1421886520), ldc:int(-14914838))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u52d3\u36d3\u4e72\uf94d\ucfaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-1996542524))
        }
        else {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-1814152501))
            var_5_8A = and:int(ldc:int(19814), ldc:int(-20327))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(24757), ldc:int(-28854)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_69F:int, ldc:int(-1098945543))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(9312), ldc:int(9313)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(6), ldc:int(7)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_DA:int, ldc:int(-287463716))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(20516), ldc:int(20517)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-763840187))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(981411910))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2058396387))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1668439849))
                    }
                    else {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1478543363))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1241795184))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1267183195))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1434093213))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(876645933))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1091951247))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1151419426))
                        var_11_EB = and:int(ldc:int(6915), ldc:int(-6916))
                        goto(Label_1562)
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1743947860))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1976715711))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1351123831))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1994553599))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-163662867))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1112970824))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1266739404))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(568705244))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1281884299))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-300519790))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1722059944))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-296102278))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(255833913))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-700665910))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1273493743))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-730199994))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(581716774))
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1715427851))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1317448647))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1820509218))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(59), ldc:int(769))
                                goto(Label_1182)
                            }
                        }
                    }
                    
                    Label_1013:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1185432695))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-283335862))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1120747828))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-651025390))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(704378938))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-950173748))
                        var_11_EB = and:int(ldc:int(8864), ldc:int(-8865))
                    }
                    
                    Label_1182:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-318624465))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1013)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1154653120))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(2112981691))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-685855015))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1443)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(770102716))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(2141102700))
                            goto(Label_1182)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1509539537))
                            goto(Label_1013)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1063631621))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1449137780))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1908659253))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1443:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-412471539))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2083776328))
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-81988897))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1952229160))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-349707775))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-788654506))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1956935780))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-151110918))
                        var_17_6AA = add:int(var_16_119:int, and:int(ldc:int(16513), ldc:int(4445)))
                        looporswitchbreak()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(217147675))
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(-1893745699))
                
                if (cmple:boolean(var_5_8A = var_17_6AA:int, sub:int(var_6_91:int, and:int(ldc:int(16393), ldc:int(6273))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
